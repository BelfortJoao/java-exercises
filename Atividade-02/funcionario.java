import java.util.*;

/**
 * funcionario
 */
public class funcionario {

  private String nome;
  private Date nascimento;
  private Date admissao;
  private String contrato;
  private Monetario monetario;
  private int nFilhos;

  public funcionario() {
    this.nome = "Funcionario";
    this.contrato = "";
    this.monetario = new Monetario();
    this.nFilhos = 0;
  }

  public funcionario(String nome, int dia, int mes, int ano) {
    this.nome = nome;
    this.nascimento = new Date(dia, mes, ano);
  }

  public float salarioLiquido() {
    return this.monetario.calculaSalarioLiquido();
  }

  public void contratar(String contrato, int salario, int nFilhos) {
    this.contrato = contrato;
    this.monetario.setSalario(salario);
    this.nFilhos = nFilhos;
    this.admissao = new Date();
  }

  public float salarioBruto(int horas) {
    float salario;

    if (this.contrato == "Horista") {
      salario = this.monetario.getSalario() * horas;
    } else {
      salario = this.monetario.getSalario();
    }

    return salario;
  }

  public void setSalario(float salario) {
    this.monetario.setSalario(salario);
  }

  public float getSalario() {
    float salario = this.monetario.getSalario();
    return salario;
  }

  public void setFilhos(int filhos) {
    this.nFilhos = filhos;
  }

  public int getFilhos() {
    int filhos = this.nFilhos;
    return filhos;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    String nome = this.nome;
    return nome;
  }

  public void setContrato(String contrato) {
    this.contrato = contrato;
  }

  public String getContato() {
    String contrato = this.contrato;
    return contrato;
  }

  public void setAdmissao(int dia, int mes, int ano) {
    Date date = new Date(dia, mes, ano);
    this.admissao = date;
  }

  public Date getAdmissao() {
    Date admissao = this.admissao;
    return admissao;
  }
}
