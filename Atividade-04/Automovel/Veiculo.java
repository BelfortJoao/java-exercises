/**
 * Veiculo
 */
public abstract class Veiculo {

  private float velocidade;

  public Veiculo() {
    super();
  }

  public abstract int getNumerodeRodas();

  public void acelerar(float velocidade) {
    this.velocidade = velocidade;
  }

  public void parar() {
    this.velocidade = 0;
  }

  public float getVelocidade() {
    return velocidade;
  }
}
