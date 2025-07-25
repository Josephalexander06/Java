package module_1;

import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();

        }
        int Largest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > Largest) {
                Largest = numbers[i];
            }
        }
        System.out.println("Large Value = " + Largest);
        sc.close();
    }
}
