import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Stadistics<T extends Number & Comparable<T>> {
    private String file1;
    private List<T> lista1;

    public Stadistics(String file1){
        this.file1=file1;
        lista1 = new LinkedList();
        try {
            read();
            List<? extends Number> hola = new LinkedList<>();
            hola.add(new Number()));

            mean(new LinkedList<>().add());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void read() throws FileNotFoundException {
        File x = new File(file1);
        Scanner sc = new Scanner(x);
        sc.useDelimiter("\\D");sc.useDelimiter("\\D");
        String entradaTeclado = "";
        while (sc.hasNext()){
            entradaTeclado = sc.nextLine();
           // lista1.add(sc.next());
        }
        for(int i = 0;i<lista1.size();i++){
            System.out.println(lista1.get(i));
        }
    }

    public int mean(LinkedList<? extends Comparable>listado){
        int cont = 0;
        for(Comparable n: listado){
            if(n.getClass().getClass().equals(Integer.class)){
                cont+=Integer.parseInt(n.toString());
            } else if (n.getClass().getClass().equals(Double.class)) {
                cont+=Double.parseDouble(n.toString());
            }
        }
        cont%=listado.size();
        return  cont;
    }

    public int standev(LinkedList<? extends Number> listado){
        int cont = 0;
        return 0;
    }
}

