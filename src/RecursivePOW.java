import javax.swing.*;

public class RecursivePOW {

    public static int myPow(int x, int y)
    {
        int powCalculate=1;

        if(y != 0)
        {
                powCalculate = x * myPow(x,y-1);
        }
        return powCalculate;

    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,myPow(2,3));
    }
}
