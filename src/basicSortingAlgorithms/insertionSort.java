package basicSortingAlgorithms;

// Same as selection sort, it pushes in front also but in a sorted array

public class insertionSort {

    private void insertionSortImplementation(int[] array) {
        int n = array.length;

        for (int i = 1 ; i < n ; i++) {
            int key = array[i];

            int j = i-1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
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
        insertionSort result = new insertionSort();
        result.insertionSortImplementation(array);
    }
}
