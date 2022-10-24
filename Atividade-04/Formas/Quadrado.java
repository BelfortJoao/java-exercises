/**
 * Quadrado
 */
public class Quadrado extends Retangulo {

  public Quadrado(int lado) {
    super(lado, lado);
  }

  @Override
  public String getTipo() {
    return "Circulo";
  }
}
