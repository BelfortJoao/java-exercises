public class Monetario {
  private float salario;
  private float inss;
  private float renda;

  public void calculaINSS() {
    if (this.salario <= 1659.38) {
      this.inss = this.salario / 12.5f;
    } else {
      if (this.salario < 2765.66) {
        this.inss = (this.salario / 100) * 9;
      } else {
        if (this.salario < 5531.31) {
          this.inss = (this.salario / 100) * 11;
        } else {
          this.inss = (5531.31f / 100) * 11;
        }
      }
    }
  }

  public void calculaRenda() {
    float aliquita = 0;
    float deduzir = 0;
    if (1903.98 < this.salario) {
      aliquita = 7.5f;
      deduzir = 142.8f;
      if (2826.65 < this.salario) {
        aliquita = 15;
        deduzir = 454.8f;
        if (3751.06 < this.salario) {
          aliquita = 22.5f;
          deduzir = 636.13f;
          if (4664.68 < this.salario) {
            aliquita = 27.5f;
            deduzir = 869.36f;
          }
        }
      }
    }
    this.renda = ((salario / 100) * aliquita) - deduzir;
  }

  public float calculaSalarioLiquido() {
    this.calculaINSS();
    this.calculaRenda();
    return ((this.salario - this.inss) - this.renda);
  }

  public float getSalario() {
    float salario = this.salario;
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }
}
