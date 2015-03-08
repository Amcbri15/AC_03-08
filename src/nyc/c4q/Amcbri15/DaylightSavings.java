package nyc.c4q.Amcbri15;
import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/8/15.
 */
public class DaylightSavings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String month;
        String daylight;
        int day = 0;

        System.out.println("Please enter the month: ");
        month = in.next();

        System.out.println("Please enter the day: ");
        day = in.nextInt();

        if (month.equalsIgnoreCase("March") && day >= 8 && day <= 31 || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") ||
                month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")
                || month.equalsIgnoreCase("September"));
    }
}
