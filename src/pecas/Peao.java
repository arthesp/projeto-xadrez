package pecas;

import chessUtil.*;
import estrategias.EstrategiaPeao;

public class Peao extends Peca {
	public Peao(Cor cor, Coordenada coordenada_inicial) {
		super(cor, coordenada_inicial, new EstrategiaPeao());
	}

	@Override
	public boolean processarMovimento(Movimento movimento, tabuleiro.Tabuleiro tabuleiro) {
		boolean result = estrategiaMovimento.validarMovimento(movimento, tabuleiro);
		if (result)
			coordenada = movimento.destino();

		return result;
	}

	public boolean podeMoverDuasCasas() {
		return (cor == Cor.BRANCO) ? (coordenada.getRank() == 2) : (coordenada.getRank() == 7);
	}

	public int getDirecao() {
		return (cor == Cor.BRANCO) ? 1 : -1;
	}
}
