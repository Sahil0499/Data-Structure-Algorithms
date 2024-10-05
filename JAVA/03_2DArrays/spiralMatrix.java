// LEETCODE 54. Spiral Matrix
// Ques. -Print matrix in spiral format
// NOTE: remember the edge case where startRow == endRow & startCol == endCol;

// TC: O(m x n) { Since all the elements are being traversed once and there are total n x m elements
//  ( m elements in each row and total n rows) so the time complexity will be O(n x m)}.
// SC: O(n) { Extra Space used for storing traversal in the ans array }.

package TwoDArrays;

public class spiralMatrix {
    public static void printSpiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length -1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            // top
            for (int j= startCol; j<= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for(int i= startRow + 1; i<= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for(int j= endCol -1; j >= startCol; j--){
                if (startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for(int i = endRow - 1; i >= startRow + 1; i--){
                if (startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }
    public static void main (String args[]){
        // int matrix[][] = { {1,   2,   3,   4}, 
        //                    {5,   6,   7,   8}, 
        //                    {9,   10,  11,  12}, 
        //                    {13,  14,  15,  16}};

         int matrix[][] = { {1,   2,   3}, 
                           {5,   6,   7}, 
                           {9,   10,  11}};

        printSpiralMatrix(matrix);
    }
}



// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> ans=new ArrayList<>();
//         int m=matrix.length; //row
//         int n=matrix[0].length; //column

//         int left=0;
//         int right=n-1;
//         int top=0;
//         int bottom=m-1;


//         while(top<=bottom && left<=right){
//         //left to rigth
//         for(int i=left;i<=right;i++){
//               ans.add(matrix[top][i]);
//         }
//         top++;
//         //top to bottom
//         for(int i=top;i<=bottom;i++){
//             ans.add(matrix[i][right]);
//         }
//         right--;
//         if(top<=bottom){
//         //right to left
//         for(int i=right;i>=left;i--){
//             ans.add(matrix[bottom][i]);
//         }
//         bottom--;
//         }
//         // bottom to top
//         if(left<=right){
//         for(int i=bottom;i>=top;i--){
//             ans.add(matrix[i][left]);
//         }
//         left++;
//         }
//         }

//     return ans;
//     }
// }