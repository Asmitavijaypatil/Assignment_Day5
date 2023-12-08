import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number: ");
        int number = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= number ; i++) {
            sum = sum + (i * i);
        }
        System.out.println("sum of Squares of 1st 5 numbers is= "+sum);
    }
}
