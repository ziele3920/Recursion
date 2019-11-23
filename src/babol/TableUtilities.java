package babol;

import java.util.Random;

public class TableUtilities {
    public static void print(int[] t) {
        for (int vale:t) {
            System.out.print(vale + " ");
        }
        System.out.println();
    }

    public static int[] createAndFillTable(int size, int lowerBound, int upperBound) {
        int[] table = new int[size];
        Random random = new Random();
        for(int i = 0; i<table.length; i++)
            table[i] = random.nextInt(upperBound - lowerBound) + lowerBound + 1;
        return table;
    }
}
