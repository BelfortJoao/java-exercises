import java.util.Scanner;

public class Exercicio-2{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("\n Type a racional number:");
    double racional = input.nextDouble();
    int real = ((int) racional);
    double check = racional - real;
    if (check != 0) {
      System.out.printf("\n %d \n", real);
    } else {
      System.out.print("\n Warning: Denominator = 0\n");
    }
  }
}
