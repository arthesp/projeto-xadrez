package tabuleiro;

import chessUtil.*;
import pecas.Peca;

public final class Celula {
	private final Cor cor;
	private final Coordenada coordenada;
	protected Peca ocupada;

	public Celula(Cor cor, Coordenada coordenada) {
		this(cor, coordenada, null);
	}

	public Celula(Cor cor, Coordenada coordenada, Peca ocupada) {
		this.cor = cor;
		this.coordenada = coordenada;
		this.ocupada = ocupada;
	}

	public String toString() {
		if (ocupada != null)
			return coordenada + ":" + cor + ":" + ocupada;
		else
			return coordenada + ":" + cor;
	}
}
