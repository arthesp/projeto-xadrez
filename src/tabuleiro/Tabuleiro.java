package tabuleiro;

import java.util.ArrayList;
import chessUtil.Cor;

public class Tabuleiro {
  ArrayList<Celula> casas = new ArrayList<>();

  public Tabuleiro() {
    String[] files = {"A", "B", "C", "D", "E", "F", "G", "H"};

    for(int i = 8; i > 0; i--)
      for(int j = 0; j <= 7; j++) {
	Cor corDeCasa = ((j+i)%2) ? Cor.BRANCO : Cor.PRETO;
	casas.add(new Celula(corDeCasa, i+files[j]));
      }
    }
  } 
}
