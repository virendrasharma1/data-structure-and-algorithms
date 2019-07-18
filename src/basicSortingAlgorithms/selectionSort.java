package basicSortingAlgorithms;

public class selectionSort {

    private void selectionSortImplementation(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1 ; j < n ; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
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
        selectionSort result = new selectionSort();
        result.selectionSortImplementation(array);
    }
}
