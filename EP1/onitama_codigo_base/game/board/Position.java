package game.board;

/**
 * Classe usada para definição de estrutura de posições e movimentos do jogo
 */
public class Position {
    /**
     * Construtor que define o valor da Linha e da Coluna da posição, baseado no plano cartesiano]
     * @param row Linha
     * @param col Coluna
     */
    private int row;              // Position precisa dos atributos row e col, apra direcionar as peças
    private int col;



    public Position(int row, int col) {
        this.row = row;          // Atribuição dos parametros do construtor para os atributos
        this.col = col;
    }

    /**
     * Método que devolve o valor do eixo X da posição
     * @return Um valor int representando o eixo X
     */
    public int getRow() {     //Implentação do metodo get
        return this.row;
    }

    /**
     * Método que devolve o valor do eixo Y da posição
     *
     * @return Um valor int representando o eixo Y
     */
    public int getCol() {     //Implentação do metodo get
        return this.col;

//    @Override
//        public String toString ()  {             // Sobrepor o metoddo toStrring para que seja exibido a posição da linha e coluna
//            return row + ", " + col;
//        }

    }

    //Não foi implantado metodos setters, para não haver alteração de movimento externo


}
