import java.util.*;

/**
 * main
 */
public class main {
  public static void main(String[] args) {
    funcionario victor = new funcionario();
    funcionario joao = new funcionario("joao", 15, 9, 1995);
    joao.contratar("Efetivo", 1350, 2);
    victor.contratar("Horista", 60, 15);
    Date joaoadmissao = joao.getAdmissao();
    String joaoContrato = joao.getContato();
    String joaonome = joao.getNome();
    int vitorfilhos = victor.getFilhos();
    float vitorsalario = victor.salarioBruto(192);
    float joaoliquido = joao.salarioLiquido();
    System.out.printf("João: %s %s %.2f\n", joaoContrato, joaonome, joaoliquido);
    System.out.printf("Victor: %d %.2f", vitorfilhos, vitorsalario);
  }
}
