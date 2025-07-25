package module_1;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
