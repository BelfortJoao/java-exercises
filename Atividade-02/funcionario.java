import java.time.*;

/**
 * funcionario
 */
public class funcionario {

  private String nome;
  private LocalDate nascimento;
  private LocalDate admissao;
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
    String day = new String();
    String month = new String();
    if (mes < 10) {
      if (dia < 10) {
        day = "0" + String.valueOf(dia);
        month = "0" + String.valueOf(mes);
      } else {
        month = "0" + String.valueOf(mes);
        day = String.valueOf(dia);
      }
    } else {
      if (dia < 10) {
        day = "0" + String.valueOf(dia);
        month = String.valueOf(mes);
      } else {
        day = String.valueOf(dia);
        month = String.valueOf(mes);
      }
    }
    String date = String.valueOf(ano) + "-" + String.valueOf(month) + "-" + String.valueOf(day);
    this.nome = nome;
    this.nascimento.parse(date);
    this.monetario = new Monetario();
  }

  public float salarioLiquido() {
    return this.monetario.calculaSalarioLiquido();
  }

  public void contratar(String contrato, int salario, int nFilhos) {
    this.contrato = contrato;
    this.monetario.setSalario(salario);
    this.nFilhos = nFilhos;
    this.admissao.now();
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
    String date = String.valueOf(ano) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia);
    this.admissao = LocalDate.parse(date);
  }

  public LocalDate getAdmissao() {
    LocalDate admissao = this.admissao;
    return admissao;
  }
}
