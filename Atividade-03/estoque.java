import java.util.Random;

/**
 * estoque
 */
public class estoque {
  int quantidade;
  float valor;
  refrigerante refri;
  int ID;

  public estoque() {
    super();
  }

  public estoque(int valor, int quantidade, refrigerante refri) {
    this.refri = refri;
    this.valor = valor;
    this.quantidade = quantidade;
  }

  public int getQuantidade() {
    int quantidade = this.quantidade;
    return quantidade;
  }

  public float getValor() {
    float valor = this.valor;
    return valor;
  }

  public refrigerante getRefrigerante() {
    refrigerante refri = this.refri;
    return refri;
  }
}
