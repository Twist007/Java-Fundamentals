import java.util.Scanner;

public class p03_RubiksMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] rowCol = scan.nextLine().split(" ");
        int rows = Integer.parseInt(rowCol[0]);
        int cols = Integer.parseInt(rowCol[1]);

        int num = 1;
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = num++;
            }
        }

        int comNum = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < comNum; i++) {
            String[] commandArg = scan.nextLine().split("\\s+");
            int comRowCol = Integer.parseInt(commandArg[0]);
            String direction = commandArg[1];
            int moves = Integer.parseInt(commandArg[2]);

            switch (direction) {
                case "up":
                    int countMoves = 1;
                    for (int row = 0; row < moves; row++) {
                        int first = matrix[0][comRowCol];
                        matrix[row][comRowCol]=matrix[row+1][comRowCol];
                        int next = matrix[row + countMoves][comRowCol];
                        matrix[row][comRowCol] = next;
                        countMoves++;
                        matrix[countMoves - 1][comRowCol] = first;

                    }

                    break;
                case "down":
                    break;
                case "left":
                    break;
                case "right":
                    break;
            }
        }
    }
}











