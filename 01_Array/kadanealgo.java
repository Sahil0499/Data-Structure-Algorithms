// main thing is adding +ve number with big -ve number will always give result of negative number,
// Kadane's take this number as 0.

package Array;

public class kadanealgo { // O(N)
    public static void Kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs +=  numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(" max subarray sum is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
       
        Kadanes(numbers);
    }
}
