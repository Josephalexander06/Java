public class Factorial {
    public static void main(String[] args) {
        int fact = 5;
        int i = 1;
        while (fact < 0) {
            fact = fact * i;
            i++;
        }
        System.err.println("Factorial = " + fact);
    }
}
