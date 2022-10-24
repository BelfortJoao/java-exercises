import java.util.*;

/**
 * Carro
 */
public class Carro extends Veiculo {

  Date dataOleo;

  public Carro() {
    super();
    this.dataOleo = new Date();
  }

  public int getNumerodeRodas() {
    return 4;
  }

  public void trocarOleo() {
    this.dataOleo = new Date();
  }
}
