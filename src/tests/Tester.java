package tests;

import arrays.ArrayUtil;

import java.util.Random;

public class Tester {

    public static void testMethod(){
        Random random = new Random();
        int n;
        for (int i = 0; i < 1000; i++) {
            n = random.nextInt(20) + 2;
            int[] mas = new int[n];
            ArrayUtil.fillRandom(mas);
            ArrayUtil.sort(mas);
            if (ArrayUtil.isOrder(mas))
                System.out.println("---------test " + i + " is successful");
            else
                System.err.println("---------test " + i + " is invalid");
        }
    }

}
