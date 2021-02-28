
package odev4;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Odev4 {

    public static void main(String[] args) throws IOException {

        //Okuma ve listeye yazma işlemleri
        BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));
        List<Integer>[] liste = new List[4];
        liste[0] = new ArrayList<Integer>();
        liste[1] = new ArrayList();
        liste[2] = new ArrayList();
        liste[3] = new ArrayList();

        String str = "";
        do {
            str = br.readLine();
            if (str != null) {
                liste[0].add(Integer.parseInt(str.substring(0, 1)));
                liste[1].add(Integer.parseInt(str.substring(1, 2)));
                liste[2].add(Integer.parseInt(str.substring(2, 3)));
                liste[3].add(Integer.parseInt(str.substring(3, 4)));
            }
        } while (str != null);

        Seri seri = new Seri(liste);
        Paralel paralel = new Paralel(liste);

        System.out.println("\n\nSüre Farkı (S-P): " + (seri.zaman - paralel.zaman) + " nanosaniye");
    }
}
