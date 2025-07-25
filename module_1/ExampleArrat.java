package module_1;
import java.util.Scanner;

public class ExampleArrat {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length: ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Length: " + numbers.length);
        System.out.println("Value of array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i] * 2);
        }
        sc.close();
    }
}
