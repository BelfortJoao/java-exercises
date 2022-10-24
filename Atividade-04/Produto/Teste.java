/**
 * Teste
 */
public class Teste {
  public static void main(String[] args) {
    int serial = 134;
    Produto vassoura = new Produto(serial);
    boolean resultado = vassoura.testaUnidade();
    System.out.println(vassoura.toString());
    System.out.println(resultado);
  }
}
