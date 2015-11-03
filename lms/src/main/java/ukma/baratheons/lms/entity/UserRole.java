package ukma.baratheons.lms.entity;

/**
 * Created by user on 03.11.2015.
 */
public class UserRole {

    private int id;
    private String name;
    private String defRights;

    public UserRole() {
    }

    public UserRole(String name, String defRights) {
        this.name = name;
        this.defRights = defRights;
    }

    public UserRole(int id, String name, String defRights) {
        this.id = id;
        this.name = name;
        this.defRights = defRights;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefRights() {
        return defRights;
    }

    public void setDefRights(String defRights) {
        this.defRights = defRights;
    }
}
