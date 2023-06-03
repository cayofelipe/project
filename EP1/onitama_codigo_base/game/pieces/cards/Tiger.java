package game.pieces.cards;

import game.board.Piece;
import game.board.Position;
import game.pieces.Card;
import game.rules.*;

public class Tiger extends Card {   // Tiger é um tipo de movimento de carta


    /**
     * Construtor que define os principais atributos de uma cara
     *
     * @param name      Nome da carta
     * @param color     Cor da carta
     * @param positions Todas as posições relativas de movimento
     */
    public Tiger(String name, Color color, Position[] positions) {
        super(name, color, positions);



    }
}
