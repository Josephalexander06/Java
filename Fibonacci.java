public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int count = 10;

        while (count > 0) {
            System.out.println("Fib = " + n1);
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            count--;
        }
    }
}
