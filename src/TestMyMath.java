public class TestMyMath {

    public static void main(String[] args) {

        int result = MyMath.smalletNumber(1,2,5);
        int result2 = MyMath.smalletNumber(12,5,10);
        int result3 = MyMath.smalletNumber(15,20,3);




        System.out.print("Smallest number: " + result);
        //expect 1
        System.out.print("\nSmallest number: " + result2);
        //expect 5
        System.out.print("\nSmallest number: " + result3);
        //expect 3

        int powResult = MyMath.powCalculation(2,0);
        System.out.print("\n\nThe number is: " + powResult);
        //expect 1

        int powResult2 = MyMath.powCalculation(3,1);
        System.out.print("\nThe number is: " + powResult2);
        //expect 3

        int powResult3 = MyMath.powCalculation(2,6);
        System.out.print("\nThe number is: " + powResult3);
        //expect 64

        boolean primeResult = MyMath.isPrime(6);
        System.out.print("\nIs the number is a prime number?: " + primeResult);

    }
}
