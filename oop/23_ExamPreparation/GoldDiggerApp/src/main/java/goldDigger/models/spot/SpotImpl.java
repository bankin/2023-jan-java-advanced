package goldDigger.models.spot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static goldDigger.common.ExceptionMessages.SPOT_NAME_NULL_OR_EMPTY;

public class SpotImpl implements Spot {
    private String name;

    private List<String> exhibits;

    public SpotImpl(String name) {
        this.setName(name);
        this.exhibits = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(SPOT_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    @Override
    public Collection<String> getExhibits() {
        return this.exhibits;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
