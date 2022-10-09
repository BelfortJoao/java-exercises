import java.lang.Math;

/**
 * maquina
 */
public class maquina {
  private estoque estoq[] = new estoque[4];
  private int[] codigos = new int[4];
  private float credito;
  private String senha;
  private String login;
  private float compra;

  private int searchCode(int code) {
    int x = 0;
    while (x < 4) {
      if (this.codigos[x] == code) {
        x = 33;
        break;
      } else {
        x = -1;
      }
    }
    return x;
  }

  private int geraCode() {
    int max = 9999, min = 1111;
    int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
    int x = 0;
    while (true) {
      if (this.codigos[x] == random) {
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        x = 0;
      } else {
        x++;
      }
      if (x >= 4) {
        break;
      }
    }
    return random;
  }

  //// FUNÇÕES DE ADMINISTRADOR////

  public maquina() {
    int x = 0;
    while (x < 4) {
      this.estoq[x] = new estoque();
      this.codigos[x] = 0;
      x++;
    }
    this.credito = 0f;
    this.login = "admin";
    this.senha = "admin";
  }

  public int resetMaquina(String login, String senha) {

    if (login != this.login || senha != this.senha) {
      System.out.println("Login ou Senha invalidos !!");
      return 0;
    }

    int x = 0;
    while (x < 4) {
      this.estoq[x] = new estoque();
      this.codigos[x] = 0;
      x++;
    }
    this.credito = 0f;
    this.login = "admin";
    this.senha = "admin";
    return 1;
  }

  public int abastecer(String login, String senha, int abastecimento, int code) {
    int x = 0;
    code = this.searchCode(code);

    if (login != this.login || senha != this.senha) {
      System.out.println("Login ou Senha invalidos !!");
      return 0;
    }

    if (code == -1) {
      System.out.println("AVISO: Codigo Invalido.");
      return 0;
    }

    if (code == 0) {
      System.out.println("AVISO: Maquina não iniciada");
      return 0;
    }
    while (x <= abastecimento) {
      x++;
      this.estoq[code].addEstoque();
    }
    return 1;
  }

  public int addEstoque(String login, String senha, float valor, int quantidade, refrigerante refri) {
    int code = geraCode();
    int aux = 0;
    for (int x = 0; x < 4; x++) {
      if (x == 0) {
        aux = x;
        break;
      }
      System.out.println("AVISO: Sem estoque Livre.");
      return 0;
    }
    this.codigos[aux] = code;
    if (login != this.login || senha != this.senha) {
      System.out.println("Login ou Senha invalidos !!");
      return 0;
    }
    this.estoq[aux] = new estoque();
    this.estoq[aux] = new estoque(valor, quantidade, refri);
    System.out.printf("Estoque de  codigo %d adicionado", code);
    return 1;
  }

  public int resetEstoque(String login, String senha, int code) {
    searchCode(code);

    if (code == -1) {
      System.out.println("AVISO: Codigo Invalido.");
      return 0;
    }
    if (login != this.login || senha != this.senha) {
      System.out.println("Login ou Senha invalidos !!");
      return 0;
    }

    this.estoq[code] = new estoque();
    return 1;
  }

  /// FUNÇÕES DE USUARIO///
  private void adicionaCredito(float credito) {
    this.credito += credito;
  }

  private void finalizaCompra() {
    System.out.printf("Retornando Credito: %.2f \n", this.credito);
    this.credito = 0;
  }

  public int Compra(int code) {
    code = searchCode(code);
    if (code == -1) {
      System.out.println("AVISO: Codigo Invalido.");
      return 0;
    }
    if (this.credito > this.estoq[code].getValor() && this.estoq[code].getQuantidade() > 0) {
      this.credito = this.credito - this.estoq[code].getValor();
      this.estoq[code].subEstoque();
      System.out.println("-COMPRA REALIZADA-");
      return 1;
    }
    System.out.println("AVISO: Credito Insuficiente");
    return 0;
  }

  public void Consulta() {
    int x = 0;
    System.out.println("\n-CODIGO-NOME-SABOR-VOLUME-R$-");
    while (x < 4) {
      refrigerante refri = this.estoq[x].getRefrigerante();
      System.out.printf("-%d-%s-%s-%d ml-R$ %.2f\n", this.codigos[x], refri.getMarca(), refri.getSabor(), refri.getMl(),
          this.estoq[x].getValor());
      x++;
    }
  }

}
