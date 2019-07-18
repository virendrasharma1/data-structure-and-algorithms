package basicSortingAlgorithms;

public class bubbleSort {

    private void bubbleSortImplementation(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArray(array);
    }

    private void printArray(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int array[] = {64, 34, 90, 25, 12, 22, 11};
        bubbleSort result = new bubbleSort();
        result.bubbleSortImplementation(array);
    }
}
