public class Task1 {
    public static void stringMethods() {
        String text = "Hello, World!";
        System.out.println(text.length());
        System.out.println(text.substring(7, 12));
        System.out.println(text.toUpperCase());
        System.out.println(text.contains("Hello"));

    }

    public static void stringComparisons() {
        String str1 = "apple";
        String str2 = "APPLE";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.indexOf('e'));
        System.out.println(str1.replace('a', 'o'));

    }
}
