import java.util.Scanner;

public class SurroundingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int[][] matrix = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int N = scanner.nextInt();

        boolean foundN = false;
        
        for (int i = 0; i < R && !foundN; i++) {
            for (int j = 0; j < C && !foundN; j++) {
                if (matrix[i][j] == N) {
                    foundN = true;
                    if(i > 0) System.out.print(matrix[i-1][j] + " ");
                    if(j > 0) System.out.print(matrix[i][j-1] + " ");
                    if(i < R - 1) System.out.print(matrix[i+1][j] + " ");
                    if(j < C - 1) System.out.print(matrix[i][j+1]);
                }
            }
        }

        if (!foundN) System.out.println(-1);
    }
}
