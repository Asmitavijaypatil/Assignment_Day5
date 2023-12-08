import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number: ");
        int number = sc.nextInt();

        double sum = 0.0;
        for (int i =1; i <= number ; i++) {
            sum = sum + (1.0 / i);
        }
         System.out.println("Sum of the series is= "+sum);
    }
}