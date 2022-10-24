/**
 * calculadora
 */
public class Calculadora {
  private float Corrent;

  public Calculadora() {
    this.Corrent = 0;
  }

  public void Clear() {
    this.Corrent = 0;
  }

  public float getCorrent() {
    return Corrent;
  }

  public void setCorrent(float corrent) {
    Corrent = corrent;
  }

  public float SomaC(float b) {
    return this.Corrent = (Corrent + b);
  }

  public float MultiplicaC(float b) {
    return this.Corrent = (Corrent * b);
  }

  public float DivideC(float b) {
    return this.Corrent = (Corrent / b);
  }

  public float SubtraiC(float b) {
    return this.Corrent = (Corrent - b);
  }

  public float Soma(float a, float b) {
    return this.Corrent = (a + b);
  }

  public float Multiplica(float a, float b) {
    return this.Corrent = (a * b);
  }

  public float Divide(float a, float b) {
    return this.Corrent = (a / b);
  }

  public float Subtrai(float a, float b) {
    return this.Corrent = (a - b);
  }
}
