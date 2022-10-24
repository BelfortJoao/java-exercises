import java.util.*;

/**
 * Circulo
 */
public class Circulo extends Forma {

  private float raio;

  public Circulo(float raio) {
    super();
    this.raio = raio;
  }

  public float calcularArea() {
    return (raio * raio) * ((float) Math.PI);
  }

  public float calcularPerimetro() {
    return (2 * raio) * ((float) Math.PI);
  }

  public String getTipo() {
    return "Circulo";
  }
}
