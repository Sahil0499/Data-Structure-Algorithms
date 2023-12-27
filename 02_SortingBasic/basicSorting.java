// Insertion Sort O(n^2) - pick an element (from unsorted part) & place in the right pos. in sorted part
// Bubble Sort O(n^2) - large element comes to the end of the array by swapping with adjacent elements
// Selection Sort O(n^2) - pick the  smallest element (from unsorted array), put it at the begining

package Sorting;

public class basicSorting {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // saving current value in temporary memory
            int prev = i - 1;
            // finding out the current position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };

        // insertionSort(arr);
        // bubbleSort(arr);
        // selectionSort(arr);
        countSort(arr);
        printArray(arr);
    }

}
