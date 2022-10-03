import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.io.File;

public class EX11 {
  public static void main(String[] args) {

    // global variables
    Scanner doc = null;
    ArrayList<String[]> data = new ArrayList<String[]>();
    File file = new File("pacientes.csv");
    int index_older = -1, older_age = 0, n = 0;
    int n_p = 0, womens_160_170_70 = 0, index_women_shortest = -1, women_shortest_higth = 9999;
    float h = 0, average = 0;
    String[] line;

    // Try to open the file
    try {
      doc = new Scanner(file);
    } catch (FileNotFoundException e) {
      System.out.printf("ERROR: File not found");
    }

    // Line loops
    while (doc.hasNext()) {
      // line split into words, and stored in data list
      data.add(doc.next().split(","));
    }

    // prints de pacientes individuais
    System.out.println("\n---------FICHA INDIVIDUAL DE PACIENTES----------");
    for (int i = 0; i <= (data.size() - 1); i++) {
      line = data.get(i);
      System.out.printf("\nPACIENTE Numero %d ______________________________\n", i + 1);

      // Somas para os calculos
      if (line[1].equalsIgnoreCase("M")) {
        h += 1.00;
      } else {

        // Mulher mais baixa
        if (Integer.parseInt(line[4]) < women_shortest_higth) {
          index_women_shortest = i;
          women_shortest_higth = Integer.parseInt(line[4]);
        }

        // Mulher entre 1,70 e 160 com mais de 70 kg
        if (Integer.parseInt(line[4]) < 170 && Integer.parseInt(line[4]) > 160 && Integer.parseInt(line[2]) > 70) {
          womens_160_170_70++;
        }
      }
      // Mais velho
      if (Integer.parseInt(line[3]) > older_age) {
        index_older = i;
        older_age = Integer.parseInt(line[3]);
      }
      // pessoas entre 25 e 18 anos
      if (Integer.parseInt(line[3]) >= 18 && Integer.parseInt(line[3]) <= 25) {
        n_p++;
      }

      for (int y = 0; y <= (line.length - 1); y++) {
        System.out.print(line[y] + "|");
      }
      System.out.print("\n");
      n++;
    }
    // calculos do relatorio
    average = h / n;
    String[] older_pacient = data.get(index_older);
    String[] women_pacient = data.get(index_women_shortest);
    // print do relatorio geral
    System.out.printf("\n\n----------------RELATORIO GERAL------------------");
    System.out.printf("\nNumero de pacientes: %d", n);
    System.out.printf("\nMedia de homens: %.2f", average);
    System.out.printf("\nMulheres entre 1,60m e 1,70m acima de 70kg: %d", womens_160_170_70);
    System.out.printf("\nNumero de pesoas entre 18 anos e 25 anos: %d", n_p);
    System.out.printf("\nPaciente mais velho: " + older_pacient[0]);
    System.out.printf("\nMulher mais baixa: " + women_pacient[0]);
    System.out.printf("\n-------------------------------------------------\n");

  }
}
