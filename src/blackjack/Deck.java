package blackjack;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author jose kaleb
 */
public class Deck {

    card Cartas[] = new card[52];
    int posicion;

    public void crearcartas() {
        String numeros = "23456789TJQA";
        String palos = "PCDT"; //pica, corazón, diamante y trébol
        int index = 0;
        for (int i = 0; i < palos.length(); i++) {
            for (int j = 0; j < numeros.length(); j++) {
                card cartadebaraja = new card();
                cartadebaraja.establecerNumero(numeros.charAt(j));
                cartadebaraja.establecerPalo(palos.charAt(i));
                this.Cartas[index] = cartadebaraja;
                index++;
            }

        }
        barajar();//barajar
    }

    private void barajar() {
        Collections.shuffle(Arrays.asList(this.Cartas));
    }

    public card getcarta() {
        if (posicion == 51) {
            System.out.print("No hay mas cartas");
            return null;
        }
        card carta = this.Cartas[posicion];
        posicion++;
        return carta;
    }
}
