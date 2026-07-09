package pecas;

import chessUtil.Cor;

public abstract class Peca {
  private Cor cor;
  private Celula coordenada;


  public Peca(Cor cor, Celula coordenada_inicial) {
    this.cor = cor;
	this.coordenada = coordenada_inicial
  }

  public abstract boolean mover(Celula destino);

  public Cor getCor() {
    return cor;
  }
}
