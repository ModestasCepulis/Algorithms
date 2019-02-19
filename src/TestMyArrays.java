import java.util.Random;

public class TestMyArrays {
    public static void main(String[] args) {

        /*
        int [] values = new int[100];
        values[0] = 1;
        values[1] = 4;
        values[2] = 15;
        values[3] = 23;
        values[4] = 55;
        
        int currentSize = 5;
        
        currentSize = MyArrays.insert(values, currentSize, 10, 2);
        //expected output 1,4,10,15,23,55
       
        for (int i=0; i < currentSize; i++)
            System.out.println(values[i]);
        */

        /*
        int [] values = new int[5];
        values[0] = 25;
        values[1] = 3;
        values[2] = 17;
        values[3] = 2;
        values[4] = 1;

        MyArrays.mergeSort(values);

        for(int i=0; i<values.length; i++)
        {
            System.out.println(values[i] + " ,");
        }
        */

        //Random created array
        /*
        Random random = new Random();
        final int SIZE = 10000;
        int[] a = new int[SIZE];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(Integer.MAX_VALUE);
        }
        */

        //Already sorted array
        final int SIZE = 10000;
        int[] a = new int[SIZE];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        a[0] = 1;
        a[1] = 5;
        a[2] = 12;
        a[3] = 52;
        a[4] = 2;
        a[5] = 2950;
        a[6] = 125125;
        a[7] = 123;
        a[8] = 24902;
        a[9] = 11111;


        //MyArrays.mergeSort(a);
        MyArrays.insert(a, 20, 2,5);

        long sTime = System.currentTimeMillis();

        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i] + " ,");
        }

        long fTime = System.currentTimeMillis();

        System.out.println(fTime - sTime + " ms");

    }
}
