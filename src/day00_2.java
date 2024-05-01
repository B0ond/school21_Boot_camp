public class day_00_0 {
    public static void main(String[] args) {
        int enter_number = getInt();

    }

        public static int getInt(){    //прием цифр
            System.out.println("Enter number: ");
            return sc.nextInt();
        }

    public static int digitSum(int n) {   //суммирует цифры в числе
        int number =  479598;
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
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

    public static int countPrime(int number){   //суммирует простые числа
        int count = 0;
        return isPrime(number) ? ++count : count;
    }
}
