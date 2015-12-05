package Problem2_DragonArmy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {
    private static final int DEFAULT_HEALTH = 250;
    private static final int DEFAULT_DAMAGE = 45;
    private static final int DEFAULT_ARMOR = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        int rows = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rows; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String color = inputData[0];
            String name = inputData[1];
            int damage = inputData[2].equals("null") ? DEFAULT_DAMAGE : Integer.parseInt(inputData[2]);
            int health = inputData[3].equals("null") ? DEFAULT_HEALTH : Integer.parseInt(inputData[3]);
            int armor = inputData[4].equals("null") ? DEFAULT_ARMOR : Integer.parseInt(inputData[4]);

            if (!dragons.containsKey(color)) {
                dragons.put(color, new TreeMap<>());
            }
            if (!dragons.get(color).containsKey(name)) {
                dragons.get(color).put(name, new int[3]);
            }

            //prezapisva stoinostite
            dragons.get(color).get(name)[0] = damage;
            dragons.get(color).get(name)[1] = health;
            dragons.get(color).get(name)[2] = armor;
        }

        for (Map.Entry<String, TreeMap<String, int[]>> pair : dragons.entrySet()) {
            System.out.println(pair.getKey() + getAverage(pair.getValue()));
            pair.getValue()
                    .entrySet()
                    .stream()
                    .forEach(innerPair -> System.out.println("-" +
                            innerPair.getKey() + " -> " +
                            "damage: " + innerPair.getValue()[0] +
                            ", health: " + innerPair.getValue()[1] +
                            ", armor: " + innerPair.getValue()[2]));
        }
    }

    public static String getAverage(TreeMap<String, int[]> dragonStats) {
        double damage = 0;
        double health = 0;
        double armor = 0;
        int count = dragonStats.size();
        for (Map.Entry<String, int[]> pair : dragonStats.entrySet()) {
            damage += pair.getValue()[0];
            health += pair.getValue()[1];
            armor += pair.getValue()[2];
        }
        double averageDamage = damage / count;
        double averageHealth = health / count;
        double averageArmor = armor / count;

        return String.format("::(%.2f/%.2f/%.2f)", averageDamage, averageHealth, averageArmor);
    }
}












