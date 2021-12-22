import java.util.Objects;

public class Lampshade extends Container {
    public Lampshade(Room room) {
        super("Абажур", room);
    }
    public Lampshade(String name, Room room) {
        super(name, room);
    }
    @Override
    public String toString() {
        return "Абажур";
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