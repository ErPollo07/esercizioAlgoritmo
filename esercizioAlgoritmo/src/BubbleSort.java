public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};

        order(arr);

        for (int i : arr) {
            System.out.print(i);
        }
    }

    private static void order(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start == end || end - start > 1) {
            bubbleUp(arr, start, end);
            --end;
            bubbleDown(arr, start, end);
            ++start;
        }
    }

    private static void bubbleUp(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] > arr[i + 1])
                switchNum(arr, i, i + 1);
        }
    }

    private static void bubbleDown(int[] arr, int start, int end) {
        for (int i = end; i > start; i--) {
            if (arr[i] < arr[i - 1])
                switchNum(arr, i, i - 1);
        }
    }

    private static void switchNum(int[] arr, int pos_a, int pos_b) {
        int temp = arr[pos_a];
        arr[pos_a] = arr[pos_b];
        arr[pos_b] = temp;
    }
}
