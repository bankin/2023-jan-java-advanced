package goldDigger.models.operation;

import goldDigger.models.discoverer.Discoverer;
import goldDigger.models.spot.Spot;

import java.util.Collection;
import java.util.Iterator;

public class OperationImpl implements Operation {

    @Override
    public void startOperation(Spot spot, Collection<Discoverer> discoverers) {
        Iterator<String> iterator = spot.getExhibits().iterator();

        for (Discoverer discoverer : discoverers) {
//            for (String exhibit : spot.getExhibits()) {
//                if (!discoverer.canDig()) {
//                    break;
//                }
//                discoverer.dig();
//
//                spot.getExhibits().remove(exhibit);
//                discoverer.getMuseum().getExhibits().add(exhibit); // Exception because we modify the collection we iterate
//            }


            while (iterator.hasNext()) {
                if (!discoverer.canDig()) {
                    break;
                }
                discoverer.dig();

                String item = iterator.next();
                discoverer.getMuseum().getExhibits().add(item);

                iterator.remove();
            }
        }
    }
}
