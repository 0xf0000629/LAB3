import java.util.Objects;

public abstract class Human implements Placed{
    public String name = "Безымянный";
    public Age age = null;
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    protected EnclosedSpace location = null;

    public Human(String name, EnclosedSpace new_location) {
        this.name = name;
        if (location != null) {
            this.location = new_location;
            this.location.place(this);
        }
    }
    @Override
    public String toString() {
        return "Имя: " + name;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Human humanization = (Human) object;
        return Objects.equals(name, humanization.name) && Objects.equals(location, humanization.location);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, location, 13);
    }
}