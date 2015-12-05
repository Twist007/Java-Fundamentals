import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p02_TargetPracticeC_SharpExam31May {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dimension = scan.nextLine();
        int rows = Integer.parseInt(dimension.split("\\s+")[0]);
        int cols = Integer.parseInt(dimension.split("\\s+")[1]);

        char[][] matrix = new char[rows][cols];

        String input = scan.nextLine();
        int snakeLenght = input.length();
        String[] shortParams = scan.nextLine().split("\\s+");
        boolean isGoingLeft = true;
        int counter = 0;

        for (int i = rows - 1; i >= 0; i--) {
            if (isGoingLeft) {
                for (int j = cols - 1; j >= 0; j--) {
                    matrix[i][j] = input.charAt(counter++ % snakeLenght);
                }
            } else {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = input.charAt(counter++ % snakeLenght);
                }
            }
            isGoingLeft = !isGoingLeft;
        }

        int impactRow = Integer.parseInt(shortParams[0]);
        int impactCol = Integer.parseInt(shortParams[1]);
        int radius = Integer.parseInt(shortParams[2]);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (isInCircle(col, row, impactRow, impactCol, radius)) {
                    matrix[row][col] = ' ';
                }
            }
        }

        boolean isFalling = false;
        do {
            isFalling = false;
            for (int row = matrix.length - 2; row >= 0; row--) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (matrix[row][col] != ' ' && (matrix[row + 1][col] == ' ')) {
                        matrix[row + 1][col] = matrix[row][col];
                        matrix[row][col] = ' ';
                        isFalling = true;
                    }
                }
            }
        } while (isFalling);

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    private static boolean isInCircle(int row, int col, int centerX, int centerY, int radius) {
        int deltaX = col - centerX;
        int deltaY = row - centerY;

        return Math.pow(deltaX, 2) + Math.pow(deltaY, 2) <= Math.pow(radius, 2);
    }
}
