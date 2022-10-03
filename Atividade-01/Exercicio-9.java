import java.util.Scanner;

public class EX9 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    // inputs
    System.out
        .print("Type an count like: \n [MULTIPLICA A POR B]\n [DIVIDE A POR B]\n [SOMA A E B]\n [SUBTRAI A DE B]\n :");
    String[] count = inp.nextLine().toUpperCase().split(" ");
    int A = Integer.parseInt(count[1]);
    int B = Integer.parseInt(count[3]);
    float C = 0;
    switch (count[0]) {
      case ("MULTIPLICA"):
        C = A * B;
        break;
      case ("DIVIDE"):
        C = A / B;
        break;
      case ("SOMA"):
        C = A + B;
        break;
      case ("SUBTRAI"):
        C = B - A;
        break;
    }
    System.out.printf("RESPSOTA: %.2f\n", C);
  }
}
