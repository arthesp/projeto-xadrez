import pecas.*;
import chessUtil.*;
import tabuleiro.Tabuleiro;

class Main {
	public static void main(String[] args) {
		Tabuleiro jogo = new Tabuleiro();
		Peca peao1 = new Peao(Cor.BRANCO, new Coordenada('a', 1));

		System.out.println(jogo);

	}
}
