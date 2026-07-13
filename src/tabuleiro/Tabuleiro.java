package tabuleiro;

import java.util.ArrayList;
import chessUtil.*;

public class Tabuleiro {
  private final Celula[][] casas = new Celula[8][8];

  public Tabuleiro() {
    char[] files = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

	Cor corDeCasa;
    for(int rank = 0; rank < 8; rank++)
      for(int file = 0; file < 8; file++) {
		corDeCasa = ((file+rank)%2 == 0) ? Cor.BRANCO : Cor.PRETO;
		casas[rank][file] = new Celula(corDeCasa, new Coordenada(rank + 1, files[7 - file]));
      }
  }

  public String toString() {
	  StringBuilder sb = new StringBuilder();

	  for(Celula[] rank : casas) {
		  for(Celula casa : rank)
			  sb.append(casa).append("\t");

		sb.append("\n");
	  }

	  return sb.toString();
  }
}
