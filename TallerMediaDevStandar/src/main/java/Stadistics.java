import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Stadistics {
    private String file1;
    private List<?> lista1;

    public Stadistics(String file1){
        this.file1=file1;
        lista1 = new LinkedList<?>();
        try {
            read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int read() throws FileNotFoundException {
        int cont = 0;
        File x = new File(file1);
        Scanner sc = new Scanner(x);
        String entradaTeclado = "";
        while (sc.hasNextLine()){
            entradaTeclado = sc.nextLine();
            lista1.add(Integer.parseInt(entradaTeclado));
        }
        for(int i = 0;i<lista1.size();i++){
            System.out.println(lista1.get(i));
        }
        return cont;
    }

}
