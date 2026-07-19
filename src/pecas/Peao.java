package pecas;

import chessUtil.*;
import estrategias.EstrategiaPeao;

public class Peao extends Peca {
	private boolean primeiroMovimento = true;

	public Peao(Cor cor, Coordenada coordenada_inicial) {
		super(cor, coordenada_inicial, new EstrategiaPeao());
	}

	@Override
	public boolean processarMovimento(Movimento movimento, tabuleiro.Tabuleiro tabuleiro) {
		boolean result = estrategiaMovimento.validarMovimento(movimento, tabuleiro);
		if (result) {
			if (this.primeiroMovimento)
				this.primeiroMovimento = false;
			coordenada = movimento.destino();
		}

		return result;
	}

	public boolean podeMoverDuasCasas() {
		return primeiroMovimento;
	}

	public int getDirecao() {
		return (cor == Cor.BRANCO) ? 1 : -1;
	}
}
