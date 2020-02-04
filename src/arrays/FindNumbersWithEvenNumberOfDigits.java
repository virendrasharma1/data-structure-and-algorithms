package arrays;

public class FindNumbersWithEvenNumberOfDigits {


    public int findNumbers(int[] nums) {

        int counter = 0;
        for (int num : nums) {


                int count = 0;

                while (num != 0) {
                    num = num / 10;
                    ++count;
                }

            double countVal = (count / 2.0);

            if ((int) (Math.ceil(countVal)) == (int) (Math.floor(countVal))) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] array = {12, 3457, 2, 6, 7896};
        FindNumbersWithEvenNumberOfDigits result = new FindNumbersWithEvenNumberOfDigits();
        System.out.println(result.findNumbers(array));
    }
}
