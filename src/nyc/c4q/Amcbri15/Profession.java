package nyc.c4q.Amcbri15;
import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/8/15.
 */
public class Profession {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String response;
        String profession;
        boolean sword;
        boolean helmet;
        boolean shovel;

        System.out.println("Do you carry a sword?");
        response = in.next();
        sword = response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no");

        System.out.println("Do you wear a helmet? ");
        response = in.next();
        helmet = response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no");

        System.out.println("Do you carry a shovel?");
        response = in.next();
        shovel = response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no");

        if (sword && helmet && !shovel)
            profession = "samurai!";
        else if (sword && !helmet && !shovel)
            profession = "ninja!";
        else if (!sword && helmet && shovel)
            profession = "construction worker!";
        else if (!sword && !helmet && shovel)
            profession = "gardener!";
        else if (!sword && helmet && !shovel)
            profession = "astronaut!";
        else if (!sword && !helmet && !shovel)
            profession = "coder!";
        else {
            profession = "unknown.";
        }

        System.out.println("Your profession is " + profession);
    }
}