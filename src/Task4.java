public class Task4 {
    public static void findMaxInArray (int arr[]){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Max value of array " + max);
    }
    public static void bubbleSort(int arr[]){
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    c++;
                }
            }
        }
        System.out.println("Sorted array using bubbleSort: ");
        for (int j : arr){
            System.out.print(j + " ");
        }
        System.out.println("\nThere were " + c + " swaps made");
    }
}
