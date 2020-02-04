package arrays;

public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        int arraySize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arraySize += nums[i];
        }
        int[] resultArray = new int[arraySize];

        int counter = 0;
        for (int j = 0 ; j < nums.length; j+=2) {
            int innerCount = nums[j];
            while(innerCount >0 ) {
                resultArray[counter] = nums[j+1];
                innerCount--;
                counter++;
            }
        }

        return resultArray;
    }

    private void printArray(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4};
        DecompressRunLengthEncodedList result = new DecompressRunLengthEncodedList();
        result.printArray(result.decompressRLElist(array));
    }
}
