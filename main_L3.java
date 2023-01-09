import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class main_L3 {
    public static void main(String[] args) {
        Personal crew = new Personal();
        crew.addUsers( new User("Mic", "Jagger", 66))
                .addUsers(new User("Alice", "Cooper", 62))
                .addUsers(new User("Jimmy", "Handrix", 65))
                .addUsers(new User("Jimmy", "Handrix", 19));
        for (User item:crew) {
            System.out.println(item);
        }
        System.out.println("----------------------------------------------------------------");

        Collections.sort(crew.getUsers());
        crew.forEach(i-> System.out.println(i));

        System.out.println("----------------------------------------------------------------");
        User big_boss = new User("Solid", "Snake", 72, crew);
        Company abc = new Company(big_boss);
        abc.forEach(i-> System.out.println(i));
        System.out.println("----------------------------------------------------------------");
        Personal crew2 = new Personal();
        crew2.addUsers(new User("Bruce", "Wayne", 37))
                .addUsers(new User("Clark", "Kent", 33));
        User mid_boss =  new User("Liquid", "Snake", 65, crew2);
        crew.addUsers(mid_boss);
        abc.forEach(i-> System.out.println(i));
        System.out.println();
        crew.forEach(i-> System.out.println(i));
        List<Integer> a = new LinkedList<>();
    }
}
