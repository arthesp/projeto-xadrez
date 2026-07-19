package estrategias;

public interface EstrategiaMovimento {
	public boolean validarMovimento(pecas.Peca, chessUtil.Movimento movimento, tabuleiro.Tabuleiro tabuleiro);
}
