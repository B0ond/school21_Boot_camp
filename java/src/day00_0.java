public class day00_0 {
    public static void main(String[] args) {
        int number =  479598;
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
