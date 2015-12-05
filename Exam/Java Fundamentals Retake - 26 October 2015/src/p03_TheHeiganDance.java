import java.util.Scanner;

public class p03_TheHeiganDance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double heiganHealth = 3_000_000;
        int playerHealth = 18500;
        double playerDamage = Double.parseDouble(scan.nextLine());

        int playerRow = 7;//15 >> 1;
        int playerCol = 7;//15 >> 1;

        String lastSpell = "";

        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            String[] tokens = line.split("\\s+");

            if (lastSpell.equals("Cloud")) {
                heiganHealth -= playerDamage;
                playerHealth -= 3500;
            }

            if (heiganHealth <= 0 || playerHealth <= 0) {
                break;
            }

            if (!lastSpell.equals("Cloud")) {
                heiganHealth -= playerDamage;
                if (heiganHealth <= 0) {
                    break;
                }
            }
            lastSpell = "Eruption";

            String spellName = tokens[0];
            int damageRow = Integer.parseInt(tokens[1]);
            int damageCol = Integer.parseInt(tokens[2]);

            int movedOnRow = playerRow;
            int moveOnCol = playerCol;
            if (isInDamageArea(damageRow, damageCol, movedOnRow, moveOnCol)) {
                movedOnRow = playerRow - 1;
                if (isInDamageArea(damageRow, damageCol, movedOnRow, moveOnCol)
                        || isNextMoveWall(movedOnRow, moveOnCol)) {
                    movedOnRow = playerRow;
                    moveOnCol = playerCol + 1;
                    if (isInDamageArea(damageRow, damageCol, movedOnRow, moveOnCol)
                            || isNextMoveWall(movedOnRow, moveOnCol)) {
                        movedOnRow = playerRow + 1;
                        moveOnCol = playerCol;
                        if (isInDamageArea(damageRow, damageCol, movedOnRow, moveOnCol)
                                || isNextMoveWall(movedOnRow, moveOnCol)) {
                            movedOnRow = playerRow;
                            moveOnCol = playerCol - 1;
                            if (isInDamageArea(damageRow, damageCol, movedOnRow, moveOnCol)
                                    || isNextMoveWall(movedOnRow, moveOnCol)) {
                                if (spellName.equals("Cloud")) {
                                    playerHealth -= 3500;
                                } else {
                                    playerHealth -= 6000;
                                }
                                lastSpell = spellName;
                            } else {
                                playerCol--;
                            }
                        } else {
                            playerRow++;
                        }
                    } else {
                        playerCol++;
                    }
                } else {
                    playerRow--;
                }
            }
        }

        if (heiganHealth <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f\n", heiganHealth);
        }

        if (playerHealth <= 0) {
            System.out.println("Player: Killed by " + (lastSpell.equals("Cloud") ? "Plague Cloud" : lastSpell));
        } else {
            System.out.println("Player: " + playerHealth);
        }
        System.out.println("Final position: " + playerRow + ", " + playerCol);
    }

    private static boolean isInDamageArea(int dmgRow, int dmgCol, int plRow, int plCol) {
        for (int row = dmgRow - 1; row <= dmgRow + 1; row++) {
            for (int col = dmgCol - 1; col <= dmgCol + 1; col++) {
                if (plRow == row && plCol == col) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isNextMoveWall(int plX, int plY) {
        return plX < 0 || plX >= 15 || plY < 0 || plY >= 15;

    }
}

















