import java.util.Objects;

public class Hometorturer extends Human {
    private boolean nightmare = false;
    public Hometorturer(String name, EnclosedSpace new_location) {
        super(name, new_location);
        this.age = Age.ADULT;
    }
    public Hometorturer(EnclosedSpace new_location) {
        super("Фрёкен Бок ", new_location);
        this.age = Age.ADULT;
    }
    public void in(EnclosedSpace new_location){
        location = new_location;
    }
    public Age getAge() {
        return age;
    }

    public void depend_action(String action_part1, Human human, String action_part2) {
        System.out.println("Фрёкен Бок " + action_part1 + human.getName() + action_part2);
    }
    public void action(String action) {
        System.out.println("Фрёкен Бок " + action);
    }
    public void TVstory(Karlson karlson) {
        System.out.println("Фрёкен Бок написала в шведское телевидение о проделках, как оказалось, " + karlson.getName() + "...");
        karlson.check();
    }

    @Override
    public String toString() {
        return "Фрёкен Бок";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Age.ADULT, "Фрёкен Бок");
    }
}