package tabuleiro;

import java.util.ArrayList;
import chessUtil.*;

public class Tabuleiro {
	private final Celula[][] casas = new Celula[8][8];

	public Tabuleiro() {
		char[] files = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

		Cor corDeCasa;
		for (int rank = 0; rank < 8; rank++)
			for (int file = 0; file < 8; file++) {
				corDeCasa = ((file + rank) % 2 == 0) ? Cor.BRANCO : Cor.PRETO;
				casas[rank][file] = new Celula(corDeCasa, new Coordenada(files[file], 8 - rank));
			}
	}

	public void mover(Movimento movimento) {
		Coordenada origem = movimento.origem();
		Coordenada destino = movimento.destino();

		Peca peca = consultarCelula(origem);
		if (peca == null)
			throw new ClassNotFoundException("Origem [" + origem + "] escolhida não contém nenhuma peça válida");
		else {
			try {
				if (peca.processarMovimento(movimento, this)) {
					casas[origem.getFileIndex()][origem.getRank()].ocupada = null;
					casas[destino.getFileIndex()][destino.getRank()].ocupada = peca;
				}
			} catch (Exception e) {
				System.out.println("A peça ["+peca+"] não pode ser movida:" + e);
			}
		}
	}

	public Peca consultarCelula(Coordenada coordenada) {
		return casas[coordenada.getFileIndex()][coordenada.getRank()].ocupada;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Celula[] rank : casas) {
			for (Celula casa : rank)
				sb.append(casa).append("\t");

			sb.append("\n");
		}

		return sb.toString();
	}
}
