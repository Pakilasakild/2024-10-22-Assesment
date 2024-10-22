public class Task3 {
    public static void secondLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int max2 = 0;
        for (int i = 0; i < 10; i++){
            if (arr[i] > max){
                max2 = max;
                max = arr[i];
            }
        }
        if (arr[0] == max){
            max = Integer.MIN_VALUE;
            for (int i = 1; i < 10; i++){
                if (arr[i] > max){
                    max2 = max;
                    max = arr[i];
                }
            }
        }
        System.out.println(max2);
    }
    public static void reverseArray (int arr[]){
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void greatestCommonDivisor(int a, int b){
        int max = Integer.max(a, b);
        int c = max-1;
        while (true){
            if (a % c == 0){
                if (b % c == 0){
                    break;
                }
                else{
                    c--;
                }
            }
            else {
                c--;
            }
        }
        System.out.print("The GCD of " + a + " and " + b + " is: ");
        System.out.print(c + "\n");
    }
    public static void randomGuesser(){
        int guess = 0, c = 0;
        while (guess != 50){
            guess = (int) (Math.random() * 100);
            c++;
        }
        System.out.println("It took " + c + " turns to find the number 50 using RNG");
    }
}
