import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IncorrectInputException {
        Room kitchen = new Room("Кухня", null);
        Lampshade lampshade = new Lampshade(kitchen);
        Chair chair = new Chair(kitchen);
        Item[] buns = new Item[5];
        Arrays.fill(buns, new Item("плюшка", kitchen));
        Item ghost_cloth = new Item("привиденческие одежды");
        Kid kid = new Kid(kitchen);
        Mom mom = new Mom(null);
        Dad dad = new Dad(null);
        Hometorturer freken_bok = new Hometorturer(kitchen);
        Karlson karlson = new Karlson(kitchen);

        for (int i=0;i<5;i++)
        karlson.take(buns[i], kitchen);
        karlson.moo("окна");

        int attempts = -1;
        NumberInput input_ = new NumberInput() {
            public int readnum(String req) {
                System.out.println(req);
                Scanner in = new Scanner(System.in);
                int data = in.nextInt();
                return data;
            }
        };
        boolean exc_flag = false;
        do {
            exc_flag = false;
            try {
                attempts = input_.readnum("Введите количество писем Фрёкен Бок:");
                freken_bok.TVstory(attempts, karlson);
            } catch (IncorrectInputException exc) {
                System.out.println(exc.getMessage());
                exc_flag = true;
            }
        } while (exc_flag == true);

        kid.get_surprised();
        mom.reality_check(karlson);
        dad.reality_check(karlson);
        freken_bok.depend_action("увидала ", karlson, "");
        freken_bok.action("льёт слёзы...");
        freken_bok.depend_action("уверяет, что раз ", karlson, " не привидение, он не представляет никакого интереса.");
        freken_bok.depend_action("плевать на то, что ", karlson, " имеет пропеллер и может летать.");
        int power = 0;
        do {
            exc_flag = false;
            try {
                power = input_.readnum("Введите мощность вращения пропеллера (%):");
                karlson.fly(power);
            } catch (InfiniteLoop exc) {
                System.out.println(exc.getMessage());
                exc_flag = true;
            }
        } while (exc_flag == true);
        karlson.take(ghost_cloth, lampshade);
        freken_bok.depend_action("посмотрела уже совсем свирепым глазом на ", karlson, ".");
        freken_bok.action("накаляется...");
        freken_bok.action("накаляется...");
        freken_bok.action("вдруг поняла, кто стащил плюшки, кто мычал у окна и кто писал на стене в кухне. Это же надо додуматься -- дарить детям такие игрушки, чтобы они летали куда им заблагорассудится и так бесстыдно издевались над старыми людьми.");
        freken_bok.depend_action("не намерена терпеть здесь ", karlson, "");
    }

}