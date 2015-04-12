package remote.dto;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by qparis on 11/04/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {
    public enum CategoryType {
        INSTALLERS,
        FUNCTIONS
    }

    public int getId() {
        return id;
    }

    public CategoryType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Script> getScripts() {
        return scripts;
    }

    int id;
    CategoryType type;
    String name;
    ArrayList <Script> scripts;

}
