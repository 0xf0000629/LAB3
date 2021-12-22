import java.util.Objects;

public class Chair extends Container {
    public String in_use = "никто";
    public Chair(String name, Room room) {
        super(name, room);
    }
    public Chair(Room room) {
        super("Стул", room);
    }
    public void set_user(Human user) {
        in_use = user.name;
    }

    @Override
    public String toString() {
        return "На стуле сидит " + in_use + ".";
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