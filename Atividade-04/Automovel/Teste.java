/**
 * Teste
 */
public class Teste {
  public static void main(String[] args) {
    Bicicleta bicicleta = new Bicicleta();
    Carro carro = new Carro();
    bicicleta.acelerar(19);
    System.out.printf("Bicicleta:\n Rodas: %d\n Velocidade: %.2f\n",
        bicicleta.getNumerodeRodas(), bicicleta.getVelocidade());
    carro.acelerar(27);
    System.out.printf("Bicicleta:\n Rodas: %d\n Velocidade: %.2f\n", carro.getNumerodeRodas(), carro.getVelocidade());
  }
}
