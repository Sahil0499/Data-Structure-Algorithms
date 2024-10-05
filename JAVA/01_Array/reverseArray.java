

public class reverseArray {
// using extra space
    // public static int[] reverse(int Arr[]){
    //     int lengthOfArray = Arr.length;
    //     int temp[] = new int[lengthOfArray];

    //     for(int i=0; i<Arr.length; i++){
    //          temp[lengthOfArray-1-i] = Arr[i];
    //     }

    //     return temp;
    // }

    public static void reverse(int arr[]){
        int first = 0;
        int last = arr.length - 1;
// done in constant space time
        while(first<last){
            int temp = arr[first];
             arr[first] = arr[last];
             arr[last] = temp;

             first++;
             last--;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        reverse(arr);  
    }
}
