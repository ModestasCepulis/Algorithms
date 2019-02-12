public class    MyMath {

    //Smallest of three numbers
    public static int smalletNumber (int x, int y, int z)
    {
        int smallest = x;

        if(y < smallest)
        {
            smallest = y;
        }
        if(z < smallest)
        {
            smallest = z;
        }
        return smallest;
    }

    //pow method

    public static int powCalculation (int a, int b)
    {
        int powCalculate=1;


        for(int i=0; i<b; i++)
        {
           powCalculate = powCalculate*a;
        }

        return powCalculate;
    }


    public static boolean isPrime(int n)
    {
        int a = 2;
        boolean factorFound = false;

        while(a<n && !factorFound)
        {
            if(n%a==0)
            {
                factorFound = true;
            }
            else
            {
                a++;
            }
        }

        return !factorFound;
    }
}
