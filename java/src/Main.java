import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int number = getInt();
        if (number < 2) {
            System.out.println("Illegal Argument");
            System.exit(-1);
        }
        int iterations = 0;
        boolean isPrimeNumber = isPrime(number, iterations);
        System.out.println("   " + isPrimeNumber + " " + iterations);

    }

    public static int getInt(){
        System.out.println("Enter number: ");
        return sc.nextInt();
    }

    public static boolean isPrime(int number, int iterations){
        if (number <= 1){
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(number) + 1; i+=2){;
            iterations++;
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}


