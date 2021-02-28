
package odev4;

import java.util.List;

public class ToplaThread extends Thread {

    List<Integer> list;
    public long toplam = 0;

    public ToplaThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        list.forEach(sayi -> {
            toplam += sayi;
        });
    }
}
