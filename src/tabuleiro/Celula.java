package tabuleiro;

import chessUtil.*;
import pecas.Peca;

public class Celula {
  private final Cor cor;
  private final Coordenada coordenada;
  private Peca ocupada;

  public Celula(Cor cor, Coordenada coordenada) {
	  this(cor, coordenada, null);
  }

  public Celula(Cor cor, Coordenada coordenada, Peca ocupada) {
    this.cor = cor;
    this.coordenada = coordenada;
	this.ocupada = ocupada;
  }

  public String toString() {
	  return coordenada + ":" + cor;
  }
}
