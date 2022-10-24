import java.util.*;

/**
 * Produto
 */
public class Produto {
  int serial;
  int volume;
  String teste;

  public Produto(int serial) {
    this.serial = serial;
    this.volume = 0;
    this.teste = "não testado";
  }

  public boolean testaUnidade() {
    int Rteste;
    Random rand = new Random();
    if (this.teste == "não testado") {
      Rteste = rand.nextInt(100);
      if (Rteste >= 90) {
        this.teste = "aprovado";
        return true;
      }
      this.teste = "reprovado";
    }

    return false;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  @Override
  public String toString() {
    String string = this.serial + "," + this.volume + "," + this.teste;
    return string;
  }
}
