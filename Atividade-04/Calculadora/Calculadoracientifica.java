import java.math.*;

/**
 * Calculadoracientifica
 */
public class Calculadoracientifica extends Calculadora {

  public Calculadoracientifica() {
    super();
  }

  public float potencia(float a, float b) {
    return (float) Math.pow(a, b);
  }

  public float raizQuadrada(float a) {
    return (float) Math.sqrt(a);
  }

  public float raizQuadradaCurrent() {
    return (float) Math.sqrt(super.getCorrent());
  }

  public float potenciaCurrent(int b) {
    return (float) Math.pow(super.getCorrent(), b);
  }
}
