package blackjack;

/**
 *
 * @author jose kaleb
 */
public class Carta {

    private char Numeros;
    private char palo; //pica, corazón, diamante y trébol

    public void establecerNumero(char s) {
        this.Numeros = s;
    }

    public void establecerPalo(char t) {
        this.palo = t;
    }
//devuelve el numero y el palo

    public char getNumero() {
        return this.Numeros;
    }

    public char getPalo() {
        return this.palo;
    }

    public int getValor() {
        //retorna valor numerico de la carta
        switch (this.Numeros) {
            case 'T':
                return 10;
            case 'J':
                return 10;
            case 'Q':
                return 10;
            case 'K':
                return 10;
            case 'A':
                return 1;
            default:
                return Integer.parseInt(this.Numeros+"");
        }
 
    }

    //devuelve la carta de forma AS, 2H, 7C, etc.
    public String AcomodarCarta() {
        String C="";
        C = this.Numeros + "" + this.palo;
        return C;
    }

}
