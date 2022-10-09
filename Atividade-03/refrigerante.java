/**
 * refrigerante
 */
public class refrigerante {
  String sabor;
  String marca;
  int ml;

  public refrigerante(int ml, String sabor, String marca) {
    this.marca = marca;
    this.ml = ml;
    this.sabor = sabor;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setMl(int ml) {
    this.ml = ml;
  }

  public String getSabor() {
    String sabor = this.sabor;
    return sabor;
  }

  public String getMarca() {
    String marca = this.marca;
    return marca;
  }

  public int getMl() {
    int ml = this.ml;
    return ml;
  }
}
