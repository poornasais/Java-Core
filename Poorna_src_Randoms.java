import java.util.Arrays;
import java.util.Random;

public class Randoms {

    int[] rand = new int[10];
    int[] count = new int[10];

    public void randoms() {
        Random rm = new Random();
        for (int i = 0; i < rand.length; i++) {
            rand[i] = rm.nextInt(10);
        }
        System.out.println(Arrays.toString(rand));
        for (int r : rand)
            count[r]++;

        for (int x = 0; x < count.length; x++) {
            System.out.println("" + x + " occurs " + count[x] + " times");

        }


    }
}
