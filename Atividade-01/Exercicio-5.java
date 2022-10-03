import java.util.Scanner;

public class Exercicio-5
{

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Type your birthday [dd/mm]:");
    String birthday = inp.nextLine().toLowerCase();
    int day = Integer.parseInt(birthday.substring(0, 2));
    int month = Integer.parseInt(birthday.substring(3, 5));
    if (month % 2 == 0 && day == 31 || month == 2 && day > 29 || month >= 12 && day >= 31) {
      System.out.println("ERROR: Invalid Input");
      System.exit(4);
    }
    System.out.print("Valid input Month: ");
    switch (month) {
      case 1:
        System.out.println("january");
        break;
      case 2:
        System.out.println("february");
        break;
      case 3:
        System.out.println("march");
        break;
      case 4:
        System.out.println("april");
        break;
      case 5:
        System.out.println("may");
        break;
      case 6:
        System.out.println("june");
        break;
      case 7:
        System.out.println("july");
        break;
      case 8:
        System.out.println("august");
        break;
      case 9:
        System.out.println("september");
        break;
      case 10:
        System.out.println("october");
        break;
      case 11:
        System.out.println("november");
        break;
      case 12:
        System.out.println("december");
        break;
    }
  }
}
