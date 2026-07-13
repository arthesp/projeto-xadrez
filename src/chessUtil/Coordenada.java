package chessUtil;

public class Coordenada {
	private final int rank;
	private final char file;

	public Coordenada(int rank, char file) {
		this.rank = rank;
		this.file = file;
	}

	public String toString() {
		return "" + file + rank;
	}
}
