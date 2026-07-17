package estrategias;

import java.util.HashSet;
import chessUtil.Coordenada;

public class EstrategiaPeao implements EstrategiaMovimento {
	public boolean validarMovimento(Cor cor, Coordenada coordenada, boolean primeiroMovimento, Coordenada movimento) {
		int multiplicador = (cor == Cor.BRANCO) ? 1 : -1;
		HashSet<Coordenada> movimentosValidos = new HashSet<>();

		if (primeiroMovimento) {
			
		}

		return movimentosValidos.contains(movimento);
	}
}
