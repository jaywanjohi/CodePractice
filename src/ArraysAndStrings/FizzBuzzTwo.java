package ArraysAndStrings;

public class FizzBuzzTwo {
    public static void main(String[] args) {
        int fizz = 3;
        int buzz = 5;
        int n  = 100;
        for (int i = 1; i<=n; i++) {
            fizz--;
            buzz--;
            if (fizz == 0  && buzz == 0) {
                System.out.println("FizzBuzz");
                fizz = 3;
                buzz = 5;
            }
//            System.out.println("I: "+ i + "Fizz: " + fizz);
            else if (fizz == 0) {
                System.out.println("Fizz!");
                fizz = 3;
            }

//            System.out.println("I: "+ i + "Buzz: " + buzz);
            else if (buzz == 0) {
                System.out.println("Buzz");
                buzz = 5;
            }

            else {
                System.out.println(i);
            }

        }
    }

}
