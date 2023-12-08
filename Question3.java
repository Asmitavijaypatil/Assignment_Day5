import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int base = sc.nextInt();
        System.out.print("Enter index value: ");
        int index = sc.nextInt();

        int result = 1;
        for (int i = 0; i < index ; i++) {
            result = result * base;
        }
         System.out.println("Power of a number is: "+result);
    }
}
