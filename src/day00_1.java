import java.util.Scanner;

public class day_00_1 {
    private static final Scanner sc = new Scanner(System.in);
    private static int iterations;

    public static void main(String[] args){
        int number = getInt();
        if (number < 2) {
            System.out.println("Illegal Argument");
            System.exit(-1);
        }
        iterations = 0;
        boolean isPrimeNumber = isPrime(number);
        System.out.println("   " + isPrimeNumber + " " + iterations);

    }

    public static int getInt(){
        System.out.println("Enter number: ");
        return sc.nextInt();
    }

    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number) + 1; i++){  //for(int i = 3; i <= Math.sqrt(number) + 1; i+=2)
            iterations++;
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}


