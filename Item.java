import java.util.ArrayList;
import java.util.Objects;

public class Item implements Placed {
    public EnclosedSpace location;
    private String name = "New Item";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Item(String name) {
        this.name = name;
    }
    public Item(String new_name, EnclosedSpace container) {
        name = new_name;
        location = container;
    }
    @Override
    public void in(EnclosedSpace new_location) {
        if (new_location != null) {
            if (location != null)
                location.remove(this);
            location = new_location;
            location.remove(this);
        }
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Item obj_items = (Item) object;
        return Objects.equals(location, obj_items.location) && Objects.equals(name, obj_items.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(location, name, 29);
    }
}