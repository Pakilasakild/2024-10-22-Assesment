public class Task2 {
    public static void calculateCircleArea(double radius) {
        double pi = 3.14159;
        System.out.println("Area: " + pi * radius * radius);
        System.out.println("Circumference: " + pi * radius * 2);
    }

    public static void calculateRectangleArea(int height, int width) {
        double pi = 3.14159;
        System.out.println("Area: " + height * width);
        System.out.println("Perimeter: " + (height + width) * 2);
    }
    public static void numberCheck (int n){
        System.out.println("True or false that: n % 5  == 0 && n > 100");
        System.out.println(n % 5 == 0 && n > 100);
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }

}
