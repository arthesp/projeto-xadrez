import pecas.*;
import tabuleiro.Tabuleiro;

class Main {
	public static void main(String[] args) {
		Tabuleiro jogo = new Tabuleiro();

		for(int i = 0; i<8; i++)
			for(int j=0; j<8; j++)
				System.out.printn(jogo.casas.cor + "\t" + jogo.casas.coordenada);

	}
}
