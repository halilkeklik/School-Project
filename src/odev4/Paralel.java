
package odev4;

import java.util.List;

public class Paralel {

    public long zaman;
    ToplaThread t1,t2,t3,t4;

    public Paralel(List<Integer>[] list) {

        //sırayla threadler oluştu ardından başlatıldı.
        t1 = new ToplaThread(list[0]);
        t2 = new ToplaThread(list[1]);
        t3 = new ToplaThread(list[2]);
        t4 = new ToplaThread(list[3]);

        //başlamadan önceki süre
        zaman = System.nanoTime();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        while (true) {
            if (!t1.isAlive()) {
                //bitiş süresi
                zaman = System.nanoTime() - zaman;
                System.out.println("---------------------------------------------");
                System.out.println("Paralel işlem zamanı: " + zaman + " nanosaniye");
                System.out.println("Paralel işlem sonucu: " + t1.toplam + t2.toplam + t3.toplam + t4.toplam);
                break;
            }
        }
    }
}
