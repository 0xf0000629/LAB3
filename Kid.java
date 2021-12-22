import java.util.Objects;

public class Kid extends Human {
    public Kid(EnclosedSpace new_location) {
        super("Малыш", new_location);
        this.age = Age.YOUNG;
    }
    public Kid(String name,EnclosedSpace new_location) {
        super(name, new_location);
        this.age = Age.YOUNG;
    }
    public void in(EnclosedSpace new_location){
        location = new_location;
    }
    public Age getAge() {
        return age;
    }

    public void get_surprised(){
        System.out.println("Малыш удивлён!");
    }

    @Override
    public String toString() {
        return "Малыш";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Age.YOUNG, "Малыш");
    }
}