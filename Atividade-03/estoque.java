import java.util.Random;

/**
 * estoque
 */
public class estoque {
  int quantidade;
  float valor;
  refrigerante refri;

  public estoque() {
    this.refri = new refrigerante(0, "NULL", "NULL");
    this.valor = 0f;
    this.quantidade = 0;
  }

  public estoque(float valor, int quantidade, refrigerante refri) {
    this.refri = refri;
    this.valor = valor;
    this.quantidade = quantidade;
  }

  public void addEstoque() {
    if (quantidade <= 20) {
      quantidade++;
    } else {
      System.out.println("AVISO: Estoque Cheio.");
    }
  }

  public void subEstoque() {
    if (quantidade > 0) {
      quantidade--;
    } else {
      System.out.println("AVISO: Estoque Vazio.");
    }
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
