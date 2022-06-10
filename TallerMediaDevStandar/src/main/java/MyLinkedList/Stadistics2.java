package MyLinkedList;

import MyLinkedList.MyLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que calcula la media y la desviacion
 */
public class Stadistics2 {
    private String file1;
    private MyLinkedList lista1;

    public Stadistics2(String file1){
        this.file1=file1;
        lista1 = new MyLinkedList();
        try {
            read();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * Lectura del archivo y llamado a los metodos de la media y desviacion
     * @throws FileNotFoundException
     */
    public void read() throws FileNotFoundException {
        File x = new File(file1);
        Scanner sc = new Scanner(x);
        sc.useDelimiter("\\D");sc.useDelimiter("\\D");
        String entradaTeclado = "";
        while (sc.hasNext()){
            entradaTeclado = sc.nextLine();
            lista1.add(Double.parseDouble(entradaTeclado));
        }
        System.out.println("El resultado de la media es : "+ mean(lista1));
        System.out.println("El resultado de la desviacion estandar  es : "+ devStand(lista1,mean(lista1)));

    }
    /**
     * Metodo usado con el fin de mi propia linked list y retornar la media
     * @param listado
     * @return La media en tipo Double
     */
    public double mean(MyLinkedList listado){
        double cont = 0;
        for(int i =0;i<listado.size();i++){
            cont+=listado.get(i);
        }
        cont/=listado.size();
        cont = (double)Math.round(cont * 100d) / 100d;
        return cont;
    }

    /**
     * Metodo usado con Mi linked list
     * @param listado
     * @param numMean
     * @return La desviacion estandar en tipo double
     */
    public double devStand(MyLinkedList listado, double numMean){
        double cont = 0;
        double suma = 0;
        for(int i =0;i<listado.size();i++){
            suma = listado.get(i);
            suma-= numMean;
            suma = Math.pow(suma,2);
            suma = (double)Math.round(suma * 100d) / 100d;
            cont+=suma;
        }
        cont/=listado.size() -1;
        cont = (double)Math.round(cont * 100d) / 100d;
        cont = Math.sqrt(cont);
        cont = (double)Math.round(cont * 100d) / 100d;
        return cont;
    }


}