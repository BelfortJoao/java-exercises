import java.util.Scanner;

public class Exercicio-3{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Type your wage:");
    float wage = input.nextInt();
    System.out.print("loan amount:");
    float loan = input.nextInt();
    float maxLoan = wage * 0.3f;
    if (loan < maxLoan) {
      System.out.printf("Loan of R$ %.2f Accepted\n", loan);
    } else {
      System.out.printf("Loan of R$ %.2f declined\n", loan);
    }
  }
}
