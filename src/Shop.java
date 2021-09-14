import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class Shop {
    AtomicLong money = new AtomicLong(0);
    int[] prices = new int[100];

    Shop() {
        createMassive();
    }

    public void createMassive() {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = (int) (Math.random() * 3000);
        }
    }

    public void printMassive() {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + "\n");
        }
    }

    public int summ() {
        int localSumm = 0;
        for (int i = 0; i < prices.length; i++) {
            localSumm = localSumm + prices[i];
        }
        return localSumm;
    }

    public void transfer(long diff) {
        long result = money.addAndGet(diff);
        System.out.printf("выручка от %s составила %d рублей\n",
                Thread.currentThread().getName(), diff);
    }

    public long getCurrent() {
        return money.get();
    }
}