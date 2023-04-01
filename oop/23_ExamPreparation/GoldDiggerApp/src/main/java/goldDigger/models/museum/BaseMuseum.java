package goldDigger.models.museum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BaseMuseum implements Museum {
    private List<String> exhibits;

    public BaseMuseum() {
        this.exhibits = new ArrayList<>();
    }

    @Override
    public Collection<String> getExhibits() {
        return this.exhibits;
    }
}
