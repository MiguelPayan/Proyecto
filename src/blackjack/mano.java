package blackjack;

import java.util.ArrayList;

/**
 *
 * @author jose kaleb
 */
public class mano {

    ArrayList<Carta> arr = new ArrayList<>();
    int posicion = 0;
    
//agrega una carta a la mano
    public void AñadirCarta(Carta c) {
        arr.add(c);
    }

//Mano inicial del jugador
    public String ManoInicial() {
        String hand = " ";
        for (int i = 0; i < arr.size(); i++) {
            hand = hand + arr.get(i).AcomodarCarta() + " ";
        }
        return hand;

    }

//Mano inicial de la casa
    public String ManoInicialCasa() {
        String hand = " ";
        for (int i = 0; i < arr.size(); i++) {
            hand = hand + arr.get(i).AcomodarCarta() + " ";
        }
        return hand;

    }

    //Valor de la mano
    public int getValor() {
        int val = 0;
        boolean as = false;
        int ValordeCarta = 0;
        for (int i = 0; i < arr.size(); i++) {
            Carta tmpcarta = arr.get(i);
            ValordeCarta = tmpcarta.getValor();
            if (ValordeCarta == 1) {
                as = true;
            }
            val += ValordeCarta;
        }
        if (as == true && val + 10 <= 21) {
            val = val + 10;
        }
        return val;
    }
    
//Valor de la mano inicial de la casa
    public int getValor0() {
        int val = 0;
        int ValordeCarta = 0;
        for (int i = 0; i < arr.size(); i++) {
            Carta tmpcarta = arr.get(i);
            ValordeCarta = tmpcarta.getValor();
            val += ValordeCarta;
        }
        return val;
    }
}
