import java.util.Objects;

public class Dad extends Human {
    private boolean nightmare = false;
    public Dad(EnclosedSpace new_location) {
        super("Папа", new_location);
        this.age = Age.ADULT;
    }
    public Dad(String name,EnclosedSpace new_location) {
        super(name, new_location);
        this.age = Age.ADULT;
    }
    public void in(EnclosedSpace new_location){
        location = new_location;
    }
    public Age getAge() {
        return age;
    }

    public void reality_check(Karlson karlson){
        if (karlson.checker.get_fame() == true){
            nightmare = true;
            System.out.println("Жизнь папы обратилась в кошмар...");
        }
        else{
            System.out.println("Жизнь папы не обратилась в кошмар!");
        }
    }

    @Override
    public String toString() {
        return "Папа";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Age.ADULT, "Папа");
    }
}