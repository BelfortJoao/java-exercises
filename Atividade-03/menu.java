import java.util.*;

/**
 * menu
 */
public class menu {
  public static void main(String[] args) {
    maquina mac = new maquina();

    mac.Consulta();

    /// LOGIN E SENHA
    Scanner login = new Scanner(System.in);
    System.out.println("Login: ");
    String username = login.nextLine();

    Scanner senha = new Scanner(System.in); // Create a Scanner object
    System.out.println("Senha: ");
    String password = senha.nextLine();

    /// REFRI

    /// ESTOQUE
    Scanner val = new Scanner(System.in); // Create a Scanner object
    System.out.println("Valor: ");
    float valor = val.nextFloat();

    Scanner quantidad = new Scanner(System.in); // Create a Scanner object
    System.out.println("Quantidade: ");
    int quantidade = quantidad.nextInt();

    Scanner marca = new Scanner(System.in); // Create a Scanner object
    System.out.println("Marca: ");
    String mark = marca.nextLine();

    Scanner sabor = new Scanner(System.in); // Create a Scanner object
    System.out.println("Sabor: ");
    String tst = sabor.nextLine();

    Scanner ml = new Scanner(System.in); // Create a Scanner object
    System.out.println("Volume(ml): ");
    int vol = ml.nextInt();

    refrigerante refri = new refrigerante(vol, tst, mark);

    mac.addEstoque(password, username, valor, quantidade, refri);
    mac.Consulta();
  }
}
