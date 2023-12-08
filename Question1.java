import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("LowerBound: ");
        int l = sc.nextInt();
        System.out.print("UpperBound: ");
        int U = sc.nextInt();

        int a = 0, b = 1, c = 0;
        while (c <= U) {
            if (c >= l) {
                System.out.println(c + " ");
            }
             a = b;
             b = c;
             c = a+b;

        }

    }
}