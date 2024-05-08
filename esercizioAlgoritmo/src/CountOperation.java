import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    static int counter = 0;

    public static void main(String[] args) {
        // Declare the arrays
        int[] arr10 = new int[10];
        int[] arr100 = new int[100];
        int[] arr1000 = new int[1000];
        int[] arr10000 = new int[10000];
        int[] arr100000 = new int[100000];

        // Population all the arrays
        populatingArray(arr10, 10);
        populatingArray(arr100, 100);
        populatingArray(arr1000, 1000);
        populatingArray(arr10000, 10000);
        populatingArray(arr100000, 100000);

        // Bubble
        System.out.println("10");
        startBubble(arr10);
        System.out.println("100");
        startBubble(arr100);
        System.out.println("1000");
        startBubble(arr1000);
        System.out.println("10000");
        startBubble(arr10000);
        System.out.println("100000");
        startBubble(arr100000);

        populatingArray(arr10, 10);
        populatingArray(arr100, 100);
        populatingArray(arr1000, 1000);
        populatingArray(arr10000, 10000);
        populatingArray(arr100000, 100000);

        // Selection
        System.out.println("10");
        startSelection(arr10);
        System.out.println("100");
        startSelection(arr100);
        System.out.println("1000");
        startSelection(arr1000);
        System.out.println("10000");
        startSelection(arr10000);
        System.out.println("100000");
        startSelection(arr100000);
    }

    private static void startSelection(int[] arr) {
        counter = 0;

        selectionSort(arr);

        System.out.println("Args = " + Arrays.toString(arr));
        System.out.println("Operation = " + counter);
    }

    private static void selectionSort(int[] arr) {
        int posMin, temp;

        for (int i = 0; i < arr.length; i++) {
            counter++;
            posMin = i;

            for (int j = i; j < arr.length; j++) {
                counter++;
                if (arr[j] < arr[posMin]) {
                    counter++;
                    posMin = j;
                }
            }
            counter++;
            temp = arr[i];
            counter++;
            arr[i] = arr[posMin];
            counter++;
            arr[posMin] = temp;
        }
    }

    /**
     * This method is used to start the sort
     * @param arr array which needs to get sort
     */
    private static void startBubble(int[] arr) {
        counter = 0;

        bubbleSort(arr);

        System.out.println("Args = " + Arrays.toString(arr));
        System.out.println("Operation = " + counter);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length; i >= 0; i--) {
            counter++; // for the for
            for (int j = 0; j < i - 1; j++) {
                counter++; // for the for
                counter++; // for condition
                if (arr[j] > arr[j+1]) {
                    counter++; // for temp
                    int temp = arr[j];
                    counter++; // for assignment
                    arr[j] = arr[j+1];
                    counter++; // for assignment
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * This method is used to populating an array
     * @param arr array which need to be populated
     * @param bound the bound for the Random class
     */
    private static void populatingArray(int[] arr, int bound) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }
    }
}
