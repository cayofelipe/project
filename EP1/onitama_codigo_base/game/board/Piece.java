package game.board;

import game.rules.Color;

/**
 * Classe que contém informações das peças de jogo
 */
public class Piece {
    protected Position position;    // Composição para implantar comando nas peças
    private Spot spot;              // Compisição para implantar identificar posição no tabuleiro


    /**
     * Construtor que define a cor e o tipo da peça
     * @param color Cor da peça
     * @param isMaster Se o tipo da peça é mestre ou não
     */
    public Piece(Color color, boolean isMaster) {

    }

    /**
     * Método que devolve a cor da peça
     * @return Enum game.rules.Color com a cor da peça
     */
    public Color getColor() {
        return null;
    }

    /**
     * Método que devolve se é um mestre ou não
     * @return Booleano true para caso seja um mestre e false caso contrário
     */
    public boolean isMaster() {
        return false;
    }

    /**
     * Método que devolve se a peça ainda está em jogo ou não
     * @return Booleano true para caso esteja em jogo e false caso contrário
     */
    public boolean isAlive() {
        return false;
    }
}
