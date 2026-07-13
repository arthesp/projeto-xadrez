package pecas;

import chessUtil.*;
import tabuleiro.Celula;
import estrategias.EstrategiaMovimento;

public abstract class Peca {
  private final Cor cor;
  private final EstrategiaMovimento estrategiaMovimento;
  private Coordenada coordenada;

  protected Peca(Cor cor, Coordenada coordenada_inicial, EstrategiaMovimento estrategiaMovimento) {

    this.cor = cor;
	this.coordenada = coordenada_inicial;
	this.estrategiaMovimento = estrategiaMovimento;
  }

  public abstract boolean mover(Celula destino);

  public Cor getCor() {
    return cor;
  }
}
