package estrategias;

public interface EstrategiaMovimento {
	public boolean validarMovimento(pecas.Peca peca, chessUtil.Movimento movimento, tabuleiro.Tabuleiro tabuleiro);
}
