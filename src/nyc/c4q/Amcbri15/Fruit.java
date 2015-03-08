package nyc.c4q.Amcbri15;
import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/8/15.
 */
public class Fruit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String fruit = null;
        String color;
        String flavor;

        System.out.println("Name your fruit: ");
        fruit = in.next();

        if (fruit.equalsIgnoreCase("banana")) {
            color = "yellow.";
            flavor = "sweet.";
        }
        else if (fruit.equalsIgnoreCase("grapefruit")){
            color = "pink.";
            flavor = "bitter.";
        }
        else if (fruit.equalsIgnoreCase("lemon")){
            color = "yellow.";
            flavor = "sour.";
        }
        else if (fruit.equalsIgnoreCase("apple")){
            color = "red, green or yellow.";
            flavor = "sweet or sour.";
        }
        else {
            System.out.println("I don't know that fruit");
            return;
        }
        System.out.println("A(n) " + fruit + " is " + color + " and tastes " + flavor);
    }
}
