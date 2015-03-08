package nyc.c4q.Amcbri15;
import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/8/15.
 */
public class Emoticons {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String emotes = null;

        System.out.println("How do you feel?");
        emotes = in.next();
        // fn + shift + F6 allows you to rename corresponding variables in your entire program at the same time

        if(emotes.equals(":)")){
            System.out.println("Looks like you're happy today!");
        }
        else if(emotes.equals(":(")){
            System.out.println("Looks like you're sad. I'm sorry.");
        }
        else if(emotes.equals(":|")){
            System.out.println("Poker face, huh?");
        }
        else if(emotes.equalsIgnoreCase(":-o")){
            System.out.println("Whoops! Didn't mean to startle you.");
        }
        else {
            System.out.println("Wow, you're hard to read...");
            /* return;
               This boots you out of the entire loop and finishes the program, ignoring whatever lines come after this
               loop.
             */
        }
    }
}
