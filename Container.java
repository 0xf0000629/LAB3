import java.util.ArrayList;
import java.util.Objects;

public class Container implements EnclosedSpace, Placed {
    public EnclosedSpace location;
    private String name = "New Container";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Container(String name) {
        this.name = name;
    }
    public Container(String new_name, EnclosedSpace container) {
        name = new_name;
        location = container;
    }
    public boolean if_contains(Placed obj) {
        return items.contains(obj);
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
    public void place(Placed obj) {
        if (!items.contains(obj)) {
            items.add(obj);
        }
    }
    
    private ArrayList <Placed> items = new ArrayList <Placed> ();
    @Override
    public void remove(Placed obj) {
        items.remove(obj);
    }
    public void remove(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        }
    }


    @Override
    public String toString() {
        return "Items in " + name + ": " + items;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Container obj_items = (Container) object;
        return Objects.equals(items, obj_items.items) && Objects.equals(name, obj_items.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(items, name, 29);
    }
}