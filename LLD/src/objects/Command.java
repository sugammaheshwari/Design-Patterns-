package objects;

import java.util.ArrayList;
import java.util.List;

public class Command {
    private String type;
    private List<String> params = new ArrayList<String>();

    public Command(String type, List<String> params) {
        this.type = type;
        this.params = params;
    }

    public String getType() {
        return type;
    }

    public List<String> getParams() {
        return params;
    }
}
