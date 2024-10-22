import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1.stringMethods();
        System.out.println();
        Task1.stringComparisons();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter circle radius: ");
        double radius = sc.nextDouble();
        Task2.calculateCircleArea(radius);
        System.out.println("Enter rectangle height: ");
        int height = sc.nextInt();
        System.out.println("Enter rectangle width: ");
        int width = sc.nextInt();
        Task2.calculateRectangleArea(height, width);
        System.out.println("Enter a number to check: ");
        int n = sc.nextInt();
        Task2.numberCheck(n);
        System.out.println("\n\nEnter a 10 piece array: ");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        Task3.secondLargest(arr);
        Task3.reverseArray(arr);
        System.out.println("\nEnter 2 numbers to compare: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Task3.greatestCommonDivisor(a, b);
        Task3.randomGuesser();
        System.out.println("\n\n");
        Task4.findMaxInArray(arr);
        Task4.bubbleSort(arr);
    }
}