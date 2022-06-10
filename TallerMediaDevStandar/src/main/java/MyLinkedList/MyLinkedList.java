package MyLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Clase realizada para hacer lo basico de LinkedList
 */
public class MyLinkedList {
    Node head;

    /**
     * Añadiendo valores a la lista
     * @param data
     */
    public void add(Double data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
             head = node;
        }else{
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    /**
     * Mostrar la lista en la linea de comandos
     */
    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node= node.next;
        }
        System.out.println(node.data);
    }

    /**
     * Borrar el ultimo valor de la lista
     */
    public void delete(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node= node.next;
        }
        node.data= null;
    }

    /**
     * Toma el valor segun el index y
     * @param index
     * @return Valor de la lista segun la posicion
     */
    public Double get(int index) {
        int cont = 0;
        double val = 0;
        if(head==null){
            return 0.0;
        }else{
            Node node = head;
            if(index==0){
                val+= node.data;
            }else{
                while(node.next!=null){
                    if(index==cont){
                        val+= node.data;
                    }else{
                        node= node.next;
                    }
                    cont++;
                }
                if(index==cont){
                    val+=node.data;
                }
            }

        }
        return val;
    }

    /**
     *
     * @return El tamaño de la lista
     */
    public int size(){
        int cont = 0;
        Node node = head;
        while(node.next!=null){
            node= node.next;
            cont++;
        }
        cont++;
        return cont;
    }

}
