package Array;

public class smallestNumber {

    public static int smallestnumber(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i])
                smallest = numbers[i];
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = { 9, 2, 4, 6, 3, 5, 1 };
        System.out.println(smallestnumber(numbers));
    }
}
