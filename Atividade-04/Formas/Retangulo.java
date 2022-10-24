/**
 * Retangulo
 */
public class Retangulo extends Forma {

  private float lado;
  private float altura;

  public Retangulo(float lado, float altura) {
    this.altura = altura;
    this.lado = lado;
  }

  public float calcularArea() {
    return altura * lado;
  }

  public float calcularPerimetro() {
    return (altura * 2) + (lado * 2);
  }

  public String getTipo() {
    return "Retangulo";
  }

}
