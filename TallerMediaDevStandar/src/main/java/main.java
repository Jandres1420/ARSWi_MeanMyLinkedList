import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();
        Stadistics stadistics = new Stadistics(entradaTeclado);
    }
}
