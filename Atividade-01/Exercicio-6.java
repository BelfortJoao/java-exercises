import java.util.Scanner;

public class Exercicio-6
{

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    // inputs
    System.out.print("Type an time [hh:mm:ss]:");
    String time1 = inp.nextLine().toLowerCase();
    int hours1 = Integer.parseInt(time1.substring(0, 2));
    int minutes1 = Integer.parseInt(time1.substring(3, 5));
    int seconds1 = Integer.parseInt(time1.substring(6, 8));

    System.out.print("Type an time [hh:mm:ss]:");
    String time2 = inp.nextLine().toLowerCase();
    int hours2 = Integer.parseInt(time2.substring(0, 2));
    int minutes2 = Integer.parseInt(time2.substring(3, 5));
    int seconds2 = Integer.parseInt(time2.substring(6, 8));

    // Error check
    if (hours1 > 24 || minutes1 > 60 || seconds1 > 60 || hours2 > 24 || minutes2 > 60 || seconds2 > 60) {
      System.out.println("ERROR: Invalid inputs");
      System.exit(4);
    }

    // calculate times in seconds
    int stime1 = hours1 * 360 + minutes1 * 60 + seconds1;
    int stime2 = hours2 * 360 + minutes2 * 60 + seconds2;

    // output
    if (stime1 > stime2) {
      System.out.printf("Time diferences in seconds: %d\n", stime1 - stime2);
    } else {
      System.out.printf("Time diferences in seconds: %d\n", stime2 - stime1);
    }
  }
}
