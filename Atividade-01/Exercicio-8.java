import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Exercicio-8{

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int count = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    while (true) {
      count += 1;
      System.out.print("Type a number [Exit = fim]");
      String resp = inp.nextLine();

      if (resp.equalsIgnoreCase("fim")) {
        System.out.println("...Exit...");
        break;
      } else {
        int n = Integer.parseInt(resp);
        list.add(n);
      }
    }
    list.sort(Comparator.naturalOrder());
    list.forEach(System.out::println);
  }
}
