import java.util.Objects;

public class Karlson extends Human {
    public Age age = Age.ADULT;
    private static boolean is_known = false;
    public Karlson(String name, EnclosedSpace new_location) {
        super(name, new_location);
    }
    public Karlson(EnclosedSpace new_location) {
        super("Карлсон", new_location);
    }
    public void in(EnclosedSpace new_location){
        location = new_location;
    }
    public Age getAge() {
        return age;
    }
    static class Check {
        boolean get_fame()
        {
            return is_known;
        }
        void set_fame()
        {
            if (Math.random() < 0.1) {
                System.out.println("О Карлсоне узнали!");
                is_known = true;
            }
        }
    }
    Check checker = new Check();
    private class Propeller {
        private void spin(int var) {
            int time = 0;
            for (;var<100;var=Math.min(100,var*2)) {
                time+=1;
                System.out.println("Пропеллер Карлсона достиг " + var + "% мощности!");
                if (time > 10) {
                    throw new InfiniteLoop("Ошибка: бесконечный цикл");
                }
            }
        }
    }
    Propeller prop = new Propeller();
    public void fly(int base_power) throws InfiniteLoop{
        prop.spin(base_power);
        System.out.println("Карлсон взлетел!");
    }
    public void take(Item obj, Room room){
        System.out.println("Карлсон стащил " + obj.getName() + " из " + room.getName() + "!");
        room.remove(obj);
    }
    public void take(Item obj, EnclosedSpace spot){
        System.out.println("Карлсон стащил " + obj.getName() + " из " + spot.toString() + "!");
        spot.remove(obj);
    }
    public void steal(String object, Room loc){
        System.out.println("Карлсон стащил " + object + "!");
    }
    public void moo(String loc){
        System.out.println("Карлсон промычал у " + loc);
    }
    public void vandalize(String drawing, Room loc){
        System.out.println("Карлсон нарисовал " + drawing + " в " + loc.getName());
    }
    @Override
    public String toString() {
        return "Карлсон";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Age.ADULT, "Карлсон");
    }
}