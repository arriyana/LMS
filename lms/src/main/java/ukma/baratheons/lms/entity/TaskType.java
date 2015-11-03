package ukma.baratheons.lms.entity;

/**
 * Created by user on 03.11.2015.
 */
public class TaskType {
    private int id;
    private String name;

    public TaskType() {
    }

    public TaskType(String name) {
        this.name = name;
    }

    public TaskType(int id, String name) {
        this.id = id;
        this.name = name;
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
}
