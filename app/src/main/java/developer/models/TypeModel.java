package developer.models;

public class TypeModel {
    private String id;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TypeModel{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
