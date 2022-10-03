import java.util.Scanner;

public class Exercicio-7
{

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    // inputs
    System.out.print("Type a number:");
    int n = inp.nextInt();
    float sum = 0;
    int odd = 0;
    int lower = 1001;
    int bigger = -1;
    int i = 0;

    while (i < n) {
      System.out.print("Type a new number[0-1000]:");
      int number = inp.nextInt();

      if (n == 0) {
        lower = number;
        bigger = number;
      }

      // lower or bigger
      if (number > bigger) {
        bigger = number;
      }
      if (number < lower) {
        lower = number;
      }
      if (number % 2 != 0) {
        odd++;
      }
      sum += number;
      i++;
    }
    // average
    float average = (float) (sum / n);
    int even = n - odd;
    System.out.printf(" Even: %d\n Odd: %d \n Bigger: %d \n Lower: %d \n Average: %.2f \n", even, odd, bigger, lower,
        average);
  }
}
