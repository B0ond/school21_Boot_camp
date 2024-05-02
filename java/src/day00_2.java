import java.util.Scanner;

public class day00_2 {
    private static final Scanner sc = new Scanner(System.in);
    private static int count_prime = 0;

    public static void main(String[] args) {
        getInt();
        System.out.println("Count of coffee-request - " + count_prime);
    }

    public static void getInt(){   //Прием даных
        while(true){
            int number = sc.nextInt();
            if (number == 42) {
                System.out.println("Count of coffee-request - " + count_prime);
                System.exit(0);
            }
            int sum = digitSum(number);
            boolean prime_or_not = isPrime(sum);
            if (prime_or_not) {
                count_prime++;
            }
        }
    }

    public static int digitSum(int n) {   //суммирует цифры в числе
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isPrime(int number){   //проверка суммы на простоту
        if (number <= 1){
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(number) + 1; i+=2){  //for(int i = 3; i <= Math.sqrt(number) + 1; i+=2)
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}




//public static int getInt(){   //Прием даных
//    while(true){
//        System.out.println("Enter number: ");
//        int number = sc.nextInt();
//        if (number == 42) {
//            int result = countPrime(number);
//            System.out.println("Result of countPrime: " + result);
//            System.out.println("Program stopped.");
//            System.exit(0);
//        }
//        int sum = digitSum(number);
//        boolean prime_or_not = isPrime(sum);
//        if (prime_or_not) {
//            count_prime++;
//        }
//    }
//}