package fitxadomino;

public class Fitxa {

    private int valor1, valor2;
    private String[] nomfitxes = {"Blanc", "U", "Dos", "Tres", "Quatre", "Cinc", "Sis"};

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public Fitxa(int valor1, int valor2) {
        if (comprovarValors(valor1, valor2)) {
            this.valor1 = valor1;
            this.valor2 = valor2;
        } else {
            System.out.println("Aquesta fitxa no existeix!");
            //throw new IllegalArgumentException("Els valors no són valids");
            //throw new Exception("Els valors no són valids"); (General)
        }
    }

    public static boolean comprovarValors(int num1, int num2) {
        if (num1 >= 0 && num1 <= 6 && num2 >= 0 && num2 <= 6) {
            if (num1 <= num2) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        if (valor1 == valor2) {
            return String.format("%s - doble\n", nomfitxes[valor1]);
        } else {
            return String.format("%s - %s\n", nomfitxes[valor1], nomfitxes[valor2]);
        }
    }

}
