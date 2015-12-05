import java.util.Scanner;

public class p03_FireTheArrows {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());

        char[][] matrix = new char[rows][];
        boolean hasMoved = true;

        for (int i = 0; i < rows; i++) {
            matrix[i] = scan.nextLine().toCharArray();
        }

        while (hasMoved) {
            hasMoved = false;

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    switch (matrix[row][col]) {
                        case '>':
                            if (col + 1 <= matrix[row].length - 1 &&
                                    matrix[row][col + 1] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row][col + 1] = '>';
                                hasMoved = true;
                            }
                            break;
                        case '<':
                            if (col - 1 >= 0 &&
                                    matrix[row][col - 1] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row][col - 1] = '<';
                                hasMoved = true;
                            }
                            break;
                        case '^':
                            if (row - 1 >= 0 &&
                                    matrix[row - 1][col] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row - 1][col] = '^';
                                hasMoved = true;
                            }
                            break;
                        case 'v':
                            if (row + 1 <= matrix.length - 1 &&
                                    matrix[row + 1][col] == 'o') {
                                matrix[row][col] = 'o';
                                matrix[row + 1][col] = 'v';
                                hasMoved = true;
                            }
                            break;
                    }
                }
            }
        }
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
