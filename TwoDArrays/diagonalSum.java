// Find the diagonal sum of the matrix
//  NOTE: for Primary diagonal(PD) -> i==j
//        for Secondary diagnoal(SD) -> i+j = n-1 => j=n-1-i ;
package TwoDArrays;

public class diagonalSum {

    public static int printDiagonalSum(int matrix[][]) { // O^2
        int sum = 0;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }
        // return sum;

        for (int i = 0; i < matrix.length; i++) {
            // PD
            sum += matrix[i][i];
            // SD (important line)
            if (i != matrix.length - 1 - i) {  
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int matrix2[][] = { { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 } };

        System.out.println(printDiagonalSum(matrix));
        System.out.println(printDiagonalSum(matrix2));

    }

}
