package pecas;

import chessUtil.Cor;
import tabuleiro.Celula;

public abstract class Peca {
  private Cor cor;
  private Celula quadrado;


  public Peca(Cor cor, char[] coordenada_inicial) {
    this.cor = cor;
	this.quadrado.coordenada = coordenada_inicial;
  }

  public abstract boolean mover(Celula destino);

  public Cor getCor() {
    return cor;
  }
}
