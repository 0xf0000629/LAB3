import java.util.Objects;

public class Room extends Container {
    public Room(String name, EnclosedSpace building) {
        super(name, building);
    }
    @Override
    public String toString() {
        return "Это " + getName();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), 17);
    }
}