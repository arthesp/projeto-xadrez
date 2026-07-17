package pecas;

import chessUtil.*;
import tabuleiro.Celula;
import estrategias.EstrategiaMovimento;

public abstract class Peca {
	protected final Cor cor;
	protected final EstrategiaMovimento estrategiaMovimento;
	protected Coordenada coordenada;

	protected Peca(Cor cor, Coordenada coordenada_inicial, EstrategiaMovimento estrategiaMovimento) {
		this.cor = cor;
		this.coordenada = coordenada_inicial;
		this.estrategiaMovimento = estrategiaMovimento;
	}

	abstract boolean mover(Coordenada destino);

	public Coordenada getCoordenada() {
		return coordenada;
	}
}
