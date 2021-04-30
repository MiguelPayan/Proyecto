package blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jose kaleb
 */
public class Blackjack {

    public static void main(String[] args) throws IOException {
        do {
            //try {
            Baraja d = new Baraja();
            d.crearcartas();

            mano DelaCasa = new mano();
            mano Deljugador = new mano();

            DelaCasa.AñadirCarta(d.getcarta());
            Deljugador.AñadirCarta(d.getcarta());
            Deljugador.AñadirCarta(d.getcarta());
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("Estas son tus cartas: " + Deljugador.ManoInicial());
            System.out.println("Este es el valor que acumulan tus cartas: " + Deljugador.getValor());
            System.out.println("Estas son las cartas de la casa: " + DelaCasa.ManoInicialCasa());
            System.out.println("Este es el valor que acumulan las cartas de la casa: " + DelaCasa.getValor0());
            System.out.println("Desea tomar otra carta (1) o quedarse con las actuales(2)");
            String teclado = "";
            while ((teclado = br.readLine()) != null) {
                if (teclado.equalsIgnoreCase("1")) {
                    Deljugador.AñadirCarta(d.getcarta());
                    if (Deljugador.getValor() >= 22) {
                        System.out.println("Estas son tus cartas: " + Deljugador.ManoInicial());
                        System.out.println("Este es el valor que acumulan tus cartas: " + Deljugador.getValor());
                        System.out.println("Usted perdio ya que el valor de tus cartas es mayor a 21.");
                        break;
                    }
                    System.out.println("Estas son tus cartas: " + Deljugador.ManoInicial());
                    System.out.println("Este es el valor que acumulan tus cartas: " + Deljugador.getValor());

                    System.out.println("Desea tomar otra carta (1) o quedarse con las actuales(2)");
                } else {
                    while (DelaCasa.getValor() <= 16) {
                        DelaCasa.AñadirCarta(d.getcarta());
                    }
                    System.out.println("Este es el valor que acumulan tus cartas: " + Deljugador.getValor());
                    System.out.println("Estas son las cartas de la casa: " + DelaCasa.ManoInicial());
                    System.out.println("Estas son tus cartas: " + Deljugador.ManoInicial());
                    System.out.println("Este es el valor que acumulan las cartas de la casa: " + DelaCasa.getValor());  
                    if (DelaCasa.getValor() >= 22) {
                        System.out.println("Como el valor de las cartas de la casa es mayor a 21, tu ganas.");
                        break;
                    }
                    if (Deljugador.getValor() > DelaCasa.getValor()) {
                        System.out.println("Como el valor de tus cartas es mayor que el de la casa  y no pasa de 21, tu ganas.");
                        break;
                    }
                    if (Deljugador.getValor() == DelaCasa.getValor()) {
                        System.out.println("Como el valor de tus cartas es igual al valor de la casa, es un empate.");
                        break;
                    }
                    if (Deljugador.getValor() < DelaCasa.getValor()) {
                        System.out.println("Como el valor de tus cartas es menor al valor de la casa pierdes.");
                        break;
                    }

                }
            }
            System.out.println("Desea jugar de nuevo?");
            System.out.println("Si: 1   No: 2");
            teclado = "";
            while ((teclado = br.readLine()) != null) {
                if (teclado.equalsIgnoreCase("1")) {
                    break;
                } else {
                    System.out.println("Gracias por utilizar");
                    System.exit(0);
                }
            }
            /*} catch (Exception e) {
                 System.out.println(e);
            }*/
        } while (1 == 1);

    }

}
