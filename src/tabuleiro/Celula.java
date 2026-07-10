package tabuleiro;

import chessUtil.Cor;
import pecas.Peca;

public class Celula {
  private Cor cor;
  private char[] coordenada = new char[2];
  private Peca ocupada;

  public Celula(Cor cor, char[] coordenada) {
	  Celula(cor, coordenada, null);
  }

  public Celula(Cor cor, char[] coordenada, Peca ocupada) {
	if (coordenada.length != 2)
		throw new IllegalArgumentException
            ("coordenada deve conter apenas 'rank' e 'file' ");

    this.cor = cor;
    this.coordenada = coordenada;
    ocupada = ocupada;
  }
}
