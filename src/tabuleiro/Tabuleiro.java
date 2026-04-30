package tabuleiro;

import java.util.ArrayList;

public class Tabuleiro {
  ArrayList<Celula> casas;

  public Tabuleiro() {
    casas = new ArrayList<Celula>();
    String[8] coluna = {"A", "B", "C", "D", "E", "F", "G", "H"};

    for(int i = 8; i >= 0; i--)
      for(int j = 0; j < 8; j++) {
	Cor corDeCasa = (j+i%2) ? Cor.BRANCO : Cor.PRETO;
	casas.add(new Celula(corDeCasa, i+coluna[j]));
      }
    }
  } 
}
