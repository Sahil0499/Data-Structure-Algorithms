// Search in Sorted Matrix - search for a key in row wise & col wise sorted matrix

// brute force - o(n^2)
// row wise - O(nlogn)
// Approach 1 : if at(0,m-1)-> {Key < Cell value} => LEFT , {Key > Cell value} => Bottom
// Approach 2 : if at(n-1,0)-> {Key < Cell value}  => TOP , {Key > Cell value} => RIGHT

package TwoDArrays;

public class staircaseSearch {
    public static Boolean searchInSortedMatrix(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col --;
            }
            else row++;
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = { {10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}};
        int key = 26;
        searchInSortedMatrix(matrix, key);
    }
}
