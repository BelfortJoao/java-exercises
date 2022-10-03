import java.util.Scanner;

public class Exercicio-1{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Type your birthyear:");
    int birth = input.nextInt();
    System.out.print("Type the corrent year:");
    int corrent_year = input.nextInt();
    int age = corrent_year - birth;
    System.out.printf("You have %d years\n", age);
  }
}
