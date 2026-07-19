package chessUtil;

public final class Coordenada {
	private final char file;
	private final int rank;

	public Coordenada(char file, int rank) {
		this.rank = rank;
		this.file = file;
	}

	public int getRank() {
		return rank;
	}

	public char getFile() {
		return file;
	}

	public int getFileIndex() {
		return (int) file - 'a';
	}

	public String toString() {
		return "" + file + rank;
	}
}
