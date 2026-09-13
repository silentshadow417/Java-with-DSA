import java.util.*;

public class Spiral_Matrix {
    public static void Spiral(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int sr = 0; // Start Row
        int er = n - 1; // End Row
        int sc = 0; // Start column
        int ec = m - 1; // End column

        while (sr <= er && sc <= ec) {
            // Top side
            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j] + " ");
            }
            // Right side
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }
            // Bottom side
            for (int j = ec - 1; j >= sc; j--) {
                if (sr == er) break;
                System.out.print(matrix[er][j] + " ");
            }
            // Left side
            for (int i = er - 1; i >= sr + 1; i--) {
                if (sc == ec) break;
                System.out.print(matrix[i][sc] + " ");
            }
            sc++;
            ec--;
            sr++;
            er--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
        };
        Spiral(matrix);
    }
}
