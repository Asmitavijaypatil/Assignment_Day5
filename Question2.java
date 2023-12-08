public class Question2 {
    public static void main(String[] args) {

        int a = 0, b = 1, c =0;

        int start = 0;
        int end = 10;

        while (start < end) { 
            if (c % 2 == 0){
                System.out.println(c);
                start++;
              }
              a = b;
              b = c;
              c = a + b;
        }
    }
}
            