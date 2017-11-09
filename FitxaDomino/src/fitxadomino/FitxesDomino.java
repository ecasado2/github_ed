package fitxadomino;

import java.util.Random;

public class FitxesDomino {

    private Fitxa[] totesfitxes = new Fitxa[28];

    /**
     * Constructor de FitxesDomino
     */
    public FitxesDomino() {
        int cont = 0;
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                totesfitxes[cont] = new Fitxa(j, i);
                cont++;
            }
        }
    }

    public String Posicio() {
        int Fitxa = 0;
        Random aleatori = new Random();
        Fitxa = aleatori.nextInt(28);
        return totesfitxes[Fitxa].toString();
    }

    public String toString() {
        String acomulador = "";
        for (int i = 0; i < totesfitxes.length; i++) {
            acomulador += totesfitxes[i].toString();
        }
        return acomulador;
    }
}
