package blackjack;

/**
 *
 * @author jose kaleb
 */
public class card {

    private char symbol;
    private char palo; //pica, corazón, diamante y trébol

    public void establecerNumero(char s) {
        this.symbol = s;
    }

    public void establecerPalo(char t) {
        this.palo = t;
    }
//devuelve el numero y el palo

    public char getNumero() {
        return this.symbol;
    }

    public char getPalo() {
        return this.palo;
    }

    public int getValor() {
        //retorna valor numerico de la carta
        if (this.symbol == 'T') {
            return 10;
        } else if (this.symbol == 'J') {
            return 10;
        } else if (this.symbol == 'Q') {
            return 10;
        } else if (this.symbol == 'K') {
            return 10;
        } else if (this.symbol == 'A') {
            return 1;
        } else {
            return Integer.parseInt(this.symbol + " ");
        }

    }

    //devuelve la carta de forma AS, 2H, 7C, etc.
    public String tipodecarta() {
        String C = this.symbol + " " + this.palo;
        return C;
    }

}
