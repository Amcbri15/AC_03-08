package nyc.c4q.Amcbri15;
import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/8/15.
 */
public class While {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        /* Prints an infinite loop because the argument is always true
        while(true) {
            System.out.println("Hello, world!");
        }
        */

        int x = 100;
        while(x <= 100){
            System.out.println("the number is : " + x);
            System.out.println("What is another number? ");
            x = in.nextInt();
        }
    }
}
