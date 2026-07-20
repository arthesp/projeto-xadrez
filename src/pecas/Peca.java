package pecas;

import chessUtil.*;
import tabuleiro.Celula;
import tabuleiro.Tabuleiro;
import estrategias.EstrategiaMovimento;

public abstract class Peca {
	protected final Cor cor;
	protected final EstrategiaMovimento estrategiaMovimento;
	protected Coordenada coordenada;
	protected boolean promovida;

	protected Peca(Cor cor, Coordenada coordenada_inicial, EstrategiaMovimento estrategiaMovimento) {
		this.cor = cor;
		this.coordenada = coordenada_inicial;
		this.estrategiaMovimento = estrategiaMovimento;
		promovida = false;
	}

	public abstract boolean processarMovimento(Movimento movimento, Tabuleiro tabuleiro);

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public String toString() {
		return this.getClass().getSimpleName() + cor;
	}
}
