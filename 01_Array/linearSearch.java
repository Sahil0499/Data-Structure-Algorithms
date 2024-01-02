// going to every element one by one.

public class linearSearch {// o(n)

    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 56 };
        int key = 56;
        int index = linearsearch(numbers, key);
        if (index == -1)
            System.out.println("number not found");
        else
            System.out.println("number is at index " + index);
    }
}
