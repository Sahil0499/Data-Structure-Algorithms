package Array;

public class binarySearch {
    public static void main(String args[]) {
        int sample[] = { 1, 2, 3, 6, 7, 10, 18, 20, 75 };
        int key = 5;
        searchfornumber(sample, key);
    }

    public static void searchfornumber(int array[], int keyValue) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            System.out.print(mid);
            if (array[mid] == keyValue ) {
                System.out.println("key found at " + mid);
                return;
            } else if (keyValue < array[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        System.out.println("Element not found");
    }
}
