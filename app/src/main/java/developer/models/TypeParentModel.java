package developer.models;

import java.util.List;

public class TypeParentModel extends TypeModel{
    private String name;
    private float ppu;
    private List<TypeModel> topping;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPpu() {
        return ppu;
    }

    public void setPpu(float ppu) {
        this.ppu = ppu;
    }

    public List<TypeModel> getTopping() {
        return topping;
    }

    public void setTopping(List<TypeModel> topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "TypeParentModel{" +
                "name='" + name + '\'' +
                ", ppu=" + ppu +
                ", id=" + getId() +
                ", type=" + getType() +
                ", topping=" + topping +
                '}';
    }
}
