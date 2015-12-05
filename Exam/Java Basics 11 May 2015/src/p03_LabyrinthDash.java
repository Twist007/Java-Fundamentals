import java.util.Scanner;

public class p03_LabyrinthDash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        char[][] graund = new char[rows][];

        for (int i = 0; i < rows; i++) {
            graund[i] = scan.nextLine().toCharArray();
        }

        int row = 0;
        int col = 0;
        int moveCount = 0;
        int lives = 3;
        String obstacale = "@#*";

        char[] command = scan.nextLine().toCharArray();
        for (char cmd : command) {
            int currRow = row;
            int currCol = col;

            switch (cmd) {
                case '^':
                    row--;
                    break;
                case 'v':
                    row++;
                    break;
                case '>':
                    col++;
                    break;
                case '<':
                    col--;
                    break;
            }
            if (!isCellInsideMatrix(graund, row, col) || graund[row][col] == ' ') {
                moveCount++;
                System.out.println("Fell off a cliff! Game Over!");
                break;
            }

            if (graund[row][col] == '_' || graund[row][col] == '|') {
                System.out.println("Bumped a wall.");
                row = currRow;
                col = currCol;
            } else if (obstacale.indexOf(graund[row][col]) >= 0) {
                moveCount++;
                lives--;
                    System.out.println("Ouch! That hurt! Lives left: " + lives);
                if (lives <= 0) {
                    System.out.println("No lives left! Game Over!");
                    break;
                }
            } else if (graund[row][col] == '$') {
                lives++;
                moveCount++;
                System.out.println("Awesome! Lives left: " + lives);
                graund[row][col] = '.';
            } else {
                moveCount++;
                System.out.println("Made a move!");
            }
        }
        System.out.println("Total moves made: " + moveCount);
    }

    private static boolean isCellInsideMatrix(char[][] graund, int row, int col) {
        boolean isRowInsideMatrix = row >= 0 && row < graund.length;
        if (!isRowInsideMatrix) {
            return false;
        }
        boolean isColInsideMatrix = col >= 0 && col < graund[row].length;
        if (!isColInsideMatrix) {
            return false;
        }
        return true;
    }
}
