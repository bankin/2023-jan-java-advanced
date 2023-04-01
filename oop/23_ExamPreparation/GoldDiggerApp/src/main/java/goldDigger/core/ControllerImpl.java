package goldDigger.core;

import goldDigger.models.discoverer.Anthropologist;
import goldDigger.models.discoverer.Archaeologist;
import goldDigger.models.discoverer.Discoverer;
import goldDigger.models.discoverer.Geologist;
import goldDigger.models.operation.Operation;
import goldDigger.models.operation.OperationImpl;
import goldDigger.models.spot.Spot;
import goldDigger.models.spot.SpotImpl;
import goldDigger.repositories.DiscovererRepository;
import goldDigger.repositories.SpotRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static goldDigger.common.ConstantMessages.*;
import static goldDigger.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {

    private DiscovererRepository discovererRepository;
    private SpotRepository spotRepository;
    private Operation operation;

    private int inspectionCount;

    public ControllerImpl() {
        this.discovererRepository = new DiscovererRepository();
        this.spotRepository = new SpotRepository();
        this.operation = new OperationImpl();

        this.inspectionCount = 0;
    }

    @Override
    public String addDiscoverer(String kind, String discovererName) {
        Discoverer discoverer = null;

        // Check kind
        // Create discoverer
        if (kind.equals("Anthropologist")) {
            discoverer = new Anthropologist(discovererName);
        } else if (kind.equals("Archaeologist")) {
            discoverer = new Archaeologist(discovererName);
        } else if (kind.equals("Geologist")) {
            discoverer = new Geologist(discovererName);
        } else {
            // Throw if invalid kind
            throw new IllegalArgumentException(DISCOVERER_INVALID_KIND);
        }

        // Store in repo
        discovererRepository.add(discoverer);

        // Result
        return String.format(DISCOVERER_ADDED, kind, discovererName);
    }

    @Override
    public String addSpot(String spotName, String... exhibits) {
        Spot spot = new SpotImpl(spotName);

        List<String> items = Arrays.asList(exhibits);
        spot.getExhibits().addAll(items);

        this.spotRepository.add(spot);

        return String.format(SPOT_ADDED, spotName);
    }

    @Override
    public String excludeDiscoverer(String discovererName) {
        Discoverer discoverer = this.discovererRepository.byName(discovererName);

        if (discoverer == null) {
            String msg = String.format(DISCOVERER_DOES_NOT_EXIST, discovererName);
            throw new IllegalArgumentException(msg);
        }

        boolean removed = this.discovererRepository.remove(discoverer);

        if (!removed) {
            String msg = String.format(DISCOVERER_DOES_NOT_EXIST, discovererName);
            throw new IllegalArgumentException(msg);
        }

        return String.format(DISCOVERER_EXCLUDE, discovererName);
    }

    @Override
    public String inspectSpot(String spotName) {
        Spot spot = this.spotRepository.byName(spotName);

        if (spot == null) {
            // ???
        }

        Collection<Discoverer> collection = this.discovererRepository.getCollection();
        List<Discoverer> goingToMission = new ArrayList<>();
        List<Discoverer> excluded = new ArrayList<>();

        for (Discoverer discoverer : collection) {
            if (discoverer.getEnergy() <= 45) {
                excluded.add(discoverer);
            } else {
                goingToMission.add(discoverer);
            }
        }

        if (goingToMission.isEmpty()) {
            throw new IllegalArgumentException(SPOT_DISCOVERERS_DOES_NOT_EXISTS);
        }

        this.inspectionCount++;
        this.operation.startOperation(spot, goingToMission);

        return String.format(INSPECT_SPOT, spotName, excluded.size());
    }

    @Override
    public String getStatistics() {
        String discoverers = this.discovererRepository.getCollection()
                .stream()
                .map(Discoverer::toString)
                .collect(Collectors.joining("\n"));

        return String.format(FINAL_SPOT_INSPECT, this.inspectionCount) + "\n" +
            FINAL_DISCOVERER_INFO + "\n" +
            discoverers;
    }
}
