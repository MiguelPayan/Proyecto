package blackjack;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author jose kaleb
 */
public class Baraja {

    Carta cards[] = new Carta[52];
    int posicion = 0;

    public void crearcartas() {
        String numeros = "23456789TJQA";
        String palos = "ECDT"; //Espadas, corazónes, diamantes y tréboles
        int index = 0;
        for (int i = 0; i < palos.length(); i++) {
            for (int j = 0; j < numeros.length(); j++) {
                Carta cartadebaraja = new Carta();
                cartadebaraja.establecerNumero(numeros.charAt(j));
                cartadebaraja.establecerPalo(palos.charAt(i));
                this.cards[index] = cartadebaraja;
                index++;
            }

        }
        barajar();//barajar
    }

    private void barajar() {
        Collections.shuffle(Arrays.asList(this.cards));
    }

    public Carta getcarta() {
        if (posicion == 51) {
            System.out.print("No hay mas cartas");
            return null;
        }
        Carta carta = this.cards[posicion];
        posicion++;
        return carta;
    }
}
