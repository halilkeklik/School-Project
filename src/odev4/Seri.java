
package odev4;

import java.sql.Time;
import java.util.List;

public class Seri {

    public long zaman;

    public Seri(List<Integer>[] liste) {
        long toplam[] = new long[4];

        //başlama zamanı
        zaman = System.nanoTime();
        
        //sırayla seri olarak for döngüleri toplamı yaptı
        for (int sayi : liste[0]) {
            toplam[0] += sayi;
        }
        for (int sayi : liste[1]) {
            toplam[1] += sayi;
        }
        for (int sayi : liste[2]) {
            toplam[2] += sayi;
        }
        for (int sayi : liste[3]) {
            toplam[3] += sayi;
        }

        zaman = System.nanoTime() - zaman;

        System.out.println();
        System.out.println("Seri işlem zamanı: " + zaman + " nanosaniye");
        System.out.print("Seri işlem sonucu: ");
        for (long toplamlar : toplam) {
            System.out.print(toplamlar);
        }
        System.out.println();
    }
}
