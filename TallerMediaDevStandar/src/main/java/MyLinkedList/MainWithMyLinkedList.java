package MyLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class MainWithMyLinkedList {
    public static void main(String[] args) {
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.nextLine();
        Stadistics2 stadistics = new Stadistics2(entradaTeclado);
    }



}
