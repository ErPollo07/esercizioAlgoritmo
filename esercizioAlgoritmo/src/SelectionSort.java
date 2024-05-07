public class SelectionSort
{
    public static void main(String[] args) {

    }

    private static void ordina(int[] list) {
        int numberOfOdd = countOdd(list);
        int[] listEven = new int[list.length - numberOfOdd];
        int[] listOdd = new int[numberOfOdd];
        int indexEven = 0, indexOdd = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0)
                listEven[indexEven++] = list[i];
            else
                listOdd[indexOdd++] = list[i];
        }

        selection(listOdd);
        selection(listEven);

        for (int i = 0; i < indexOdd; i++) {
            list[i] = listOdd[i];
        }

        for (int i = indexOdd; i < indexEven; i++) {
            list[i] = listEven[i - indexOdd];
        }
    }

    private static void selection(int[] list) {
        int posMin;

        for (int i = 0; i < list.length; i++) {
            posMin = i;

            // Find the position of the minimum number
            for (int j = 0; j < list.length; j++) {
                if (list[j] < list[posMin]) posMin = j;
            }

            if (posMin != i)
                switchNum(list, i, posMin);
        }
    }

    private static int countOdd(int[] list) {
        int counter = 0;

        for (int i : list)
            if (i % 2 != 0) counter++;

        return counter;
    }

    private static void switchNum(int[] arr, int pos_a, int pos_b) {
        int temp = arr[pos_a];
        arr[pos_a] = arr[pos_b];
        arr[pos_b] = temp;
    }
}
