package pecas;

import Cor;

public abstract class Peca {
  private Cor cor;
  private Movimento movimento;

  public Peca(Cor cor) {
    this.cor = cor;
  

  public abstract boolean verificarMovimento(Tabuleiro tabuleiro, Celula origem, Celula destino);

  public Cor getCor() {
    return cor;
  }
}
