public class TestMyArrays {
    public static void main(String[] args) {
        
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

        }
}
