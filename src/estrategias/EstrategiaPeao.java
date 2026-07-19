package estrategias;

import java.util.HashSet;
import chessUtil.Coordenada;

public class EstrategiaPeao implements EstrategiaMovimento {
	@Override
	public boolean validarMovimento(pecas.Peao peao, Movimento movimento, tabuleiro.Tabuleiro tabuleiro) {
		int multiplicador = peao.getDirecao();
		Coordenada origem = movimento.origem();
		HashSet<Coordenada> movimentosValidos = new HashSet<>();

		Peca ocupacao = tabuleiro.consultarCelula(new Coordenada(origem.getFile(), origem.getRank() + multiplicador));
		if(ocupacao != null) {
		if (peao.podeMoverDuasCasas()) {
			
		}

		} else
			throw new IllegalArgumentException("peão ["+peao+"], em ("+origem+"), está interrompido em ("++);

		return movimentosValidos.contains(movimento.destino());
	}
}
