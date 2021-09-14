import java.util.*;

public class Summ {
    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop();
        Thread shop1 = new Thread(null, () -> shop.transfer(new Shop().summ()), "магазин 1");
        Thread shop2 = new Thread(null, () -> shop.transfer(new Shop().summ()), "магазин 2");
        Thread shop3 = new Thread(null, () -> shop.transfer(new Shop().summ()), "магазин 3");
        shop1.start();
        shop2.start();
        shop3.start();
        shop1.join();
        shop2.join();
        shop3.join();
        System.out.println("\nВыручка трех магазинов: " + shop.getCurrent());

    }
}
