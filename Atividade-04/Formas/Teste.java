import java.util.*;
import java.io.*;

/**
 * Teste
 */
public class Teste {

  public static void main(String[] args) {
    ArrayList<Forma> formas = new ArrayList<Forma>();
    Circulo circulo = new Circulo(5);
    Retangulo retangulo = new Retangulo(5, 10);
    Quadrado quadrado = new Quadrado(6);
    formas.add(circulo);
    formas.add(retangulo);
    formas.add(quadrado);

    int i = 0;
    for (Forma forma : formas) {
      System.out.printf("Tipo: %s Perimetro: %.2f Área: %.2f \n", formas.get(i).getTipo(),
          formas.get(i).calcularPerimetro(), formas.get(i).calcularArea());
      i++;
    }
  }
}
