import chessUtil.*;
import estrategias.EstrategiaMovimento;
import estrategias.EstrategiaPeao;

public class Peao extends Peca {
	private boolean primeiroMovimento = true;
	// private char promocao = 0;

	public Peao(Cor cor, Coordenada coordenada_inicial) {
		super(cor, coordenada_inicial, new EstrategiaPeao());
	}

	@Override
	public boolean mover(Coordenada destino) {
		boolean result = estrategiaMovimento.validarMovimento(cor, this.coordenada, this.primeiroMovimento, destino);
		if (result && this.primeiroMovimento)
			this.primeiroMovimento = false;

		return result;
	}
}
