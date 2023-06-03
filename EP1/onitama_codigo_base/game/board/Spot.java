package game.board;

import game.rules.Color;
import game.exception.*;

/**
 * Classe contendo ações e informações sobre cada espaço (quadrado) no tabuleiro
 */
public class Spot {
    private int row;                //precisa implantar esses paramentros para definir as linhas e colunas no tabbuileiro
    private int col;
    private Piece [][] pieces;     //Aqui será implementado a posição da peça

    /**
     * Construtor para espaços com peça e com cor
     * @param piece Peça que inicia nesse espaço do tabuleiro
     * @param pos Posição do espaço no tabuleiro
     * @param color Cor do espaço no tabuleiro (Templo)
     */


    public Spot(Piece piece, Position pos, Color color) {

    }

    /**
     * Construtor para espaços com peça e sem cor
     * @param piece Peça que inicia nesse espaço do tabuleiro
     * @param pos Posição do espaço no tabuleiro
     */
    public Spot(Piece piece, Position pos) {

    }

    /**
     * Construtor para espaços sem peça e sem cor
     * @param pos Posição do espaço no tabuleiro
     */
    public Spot(Position pos) {

    }

    /**
     * Método que devolve a posição (coordenadas) do espaço
     * @return Objeto game.board.Position contendo a posição (coordenadas) do espaço
     */
    public Position getPosition() {
        return null;
    }

    /**
     * Método que devolve a peça contida neste espaço
     * @return Objeto game.board.Piece caso tenha uma peça ou null caso o espaço esteja vazio
     */
    public Piece getPiece() {
        return null;
    }

    /**
     * Método que devolve a cor do espaço
     * @return Enum game.rules.Color com a cor do espaço. Caso o espaço não tenha cor, o valor do enum será NONE
     */
    Color getColor() {
        return null;
    }

    
    /**
     * Método que verifica se a posição é válida no tabuleiro
     * @return Um booleano que indica se o objeto representa uma posição válida no tabuleiro
     */
    public boolean isValid() {
        return false;
    }

    /**
     * Método que ocupa o espaço atual com a peça passada
     * @param piece A peça para ocupar este espaço
     * @exception IllegalMovementException Caso o espaço já esteja ocupado por uma peça da mesma cor
     */
    protected void occupySpot(Piece piece) throws IllegalMovementException {

    }

    /**
     * Método que "libera" o espaço atual, ou seja, deixa-o vazio
     */
    protected void releaseSpot() {

    }
}
