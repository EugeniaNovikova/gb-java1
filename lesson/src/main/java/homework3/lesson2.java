package homework3;

import org.w3c.dom.ls.LSOutput;

public class lesson2 {
    public static void main(String[] args) {
        int [] [] a = new int [10] [10];
        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j ++) {
                a[i] [j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a.length; j ++) {
                System.out.print(a [i] [j] + " ");
            }
            System.out.println();
        }
    }

    public static void dArray () {
        int [] [] a = new int [10] [10];
        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j ++) {
                System.out.print( a [i] [j] + " ");
            }
        }
        System.out.println();


    }
}
