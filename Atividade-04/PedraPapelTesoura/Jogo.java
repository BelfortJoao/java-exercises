import java.util.*;

/**
 * Jogo
 */
public class Jogo {

  public static void main(String[] args) {
    ArrayList<Objeto> aro = new ArrayList<Objeto>(3);
    Random rand = new Random();
    int x = rand.nextInt(3);
    System.out.printf("X: %d\n", x);
    int y = x, z = y;
    while (x == y) {
      y = rand.nextInt(3);
      System.out.printf("Y: %d\n", y);
    }
    while (z == y || z == x) {
      z = rand.nextInt(3);
      System.out.printf("Z: %d\n", z);
    }
    Pedra pedra = new Pedra();
    Papel papel = new Papel();
    Tesoura tesoura = new Tesoura();
    aro.add(x, pedra);
    aro.add(y, papel);
    aro.add(z, tesoura);
    while (true) {
      int jog1 = rand.nextInt(3);
      int jog2 = rand.nextInt(3);
      if (aro.get(jog1).getTipo() == aro.get(jog2).getTipo()) {
        System.out.printf("Empate Jogador1: %s Jogador2: %s\n", aro.get(jog1), aro.get(jog2));
      } else {

        if (aro.get(jog1).getTipo() == "Pedra" && aro.get(jog2).getTipo() == "Tesoura") {
          System.out.printf("Vitoria 1 Jogador1: %s Jogador2: %s\n", aro.get(jog1).getTipo(), aro.get(jog2).getTipo());

        }
        ;
        if (aro.get(jog1).getTipo() == "Pedra" && aro.get(jog2).getTipo() == "Papel") {

          System.out.printf("Vitoria 2 Jogador1: %s Jogador2: %s\n", aro.get(jog1).getTipo(), aro.get(jog2).getTipo());
        }
        ;
        if (aro.get(jog1).getTipo() == "Tesoura" && aro.get(jog2).getTipo() == "Papel") {

          System.out.printf("Vitoria 1 Jogador1: %s Jogador2: %s\n", aro.get(jog1).getTipo(), aro.get(jog2).getTipo());
        }
        ;
        if (aro.get(jog1).getTipo() == "Tesoura" && aro.get(jog2).getTipo() == "Pedra") {

          System.out.printf("Vitoria 2 Jogador1: %s Jogador2: %s\n", aro.get(jog1).getTipo(), aro.get(jog2).getTipo());
        }
        ;
        if (aro.get(jog1).getTipo() == "Papel" && aro.get(jog2).getTipo() == "Tesoura") {

          System.out.printf("Vitoria 2 Jogador1: %s Jogador2: %s\n", aro.get(jog1).getTipo(), aro.get(jog2).getTipo());
        }
        ;
        if (aro.get(jog1).getTipo() == "Papel" && aro.get(jog2).getTipo() == "Pedra") {

          System.out.printf("Vitoria 1 Jogador1: %s Jogador2: %s\n", aro.get(jog1).getTipo(), aro.get(jog2).getTipo());
        }
        ;
      }
    }
  }
}
