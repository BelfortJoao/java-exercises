import java.util.Random;
import java.util.Scanner;

public class Exercicio-10
{

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    Random rand = new Random();
    int numbr = rand.nextInt(101);
    int tent = 0;
    // inputs
    while (true) {
      tent += 1;
      System.out.print("Adivinhe o numero: ");
      int n = inp.nextInt();
      if (n == numbr) {
        System.out.printf("Parabéns você conseguiu acertar\n Tentativas: %d Ultima tentativa: %d Resposta: %d \n", tent,
            numbr, n);
        break;
      }
      if (n < numbr) {
        System.out.print("A resposta é maior\n");
      } else {
        System.out.print("A resposta é menor\n");
      }
    }
  }
}
