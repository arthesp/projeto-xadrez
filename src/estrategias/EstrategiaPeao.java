package estrategias;

import chessUtil.Coordenada;

public class EstrategiaPeao implements EstrategiaMovimento {
	@Override
	public boolean validarMovimento(pecas.Peao peao, Movimento movimento,
			tabuleiro.Tabuleiro tabuleiro) {

		int multiplicador = peao.getDirecao();
		Coordenada origem = movimento.origem(), destino = movimento.destino();
		char origem_coluna = origem.getFile();
		int origem_linha = origem.getRank();

		Coordenada frente = new Coordenada(origem_coluna, origem_linha + multiplicador),
				salto = new Coordenada(origem_coluna, origem_linha + multiplicador * 2);

		Coordenada diagonal_esquerda = new Coordenada((char) (origem_coluna - multiplicador),
				origem_linha + multiplicador),
				diagonal_direita = new Coordenada((char) (origem_coluna + multiplicador), origem_linha + multiplicador);

		if (destino.equals(frente)) {
		} else if (destino.equals(salto)) {
		} else if (destino.equals(diagonal_esquerda)) {
		} else if (destino.equals(diagonal_direita)) {
		} else
			throw new IllegalArgumentException("Movimento inválido: " + destino);

		return false;
	}
}
