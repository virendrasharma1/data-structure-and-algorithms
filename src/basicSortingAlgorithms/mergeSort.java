package basicSortingAlgorithms;

// dividing array into two halves and then again following the process
// Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and best)
public class mergeSort {

    private int[] sort(int[] array, int l, int r) {

        if (l < r) {
            int middle = (l + r) / 2;

            sort(array, l, middle);
            sort(array, middle + 1, r);
            merge(array, l, middle, r);
        }

        return array;
    }

    private void merge(int[] array, int l, int m, int r) {
        int newArraySizeLeft = m - l + 1;
        int newArraySizeRight = r - m;

        int[] left = new int[newArraySizeLeft];
        int[] right = new int[newArraySizeRight];

        System.arraycopy(array, l + 0, left, 0, newArraySizeLeft);
        for (int j = 0; j < newArraySizeRight; ++j) {
            right[j] = array[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < newArraySizeLeft && j < newArraySizeRight) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < newArraySizeLeft) {
            array[k] = left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < newArraySizeRight) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    private void printArray(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {64, 34, 90, 25, 12, 22, 11};
        mergeSort result = new mergeSort();
        int[] resultArray = result.sort(array, 0, array.length - 1);
        result.printArray(resultArray);
    }
}
