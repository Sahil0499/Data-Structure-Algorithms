package TwoDArrays;

import java.util.*;

public class search {

    public static Boolean searchInMatrix(int matrix[][], int Key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == Key) {
                    System.out.println("The Key " + Key + " is found in matrix at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found in matrix " + matrix[n][m]);
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int Key = sc.nextInt();
        searchInMatrix(matrix, Key);

    }
}
