import java.util.*;

public class p04_WeightLifting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, TreeMap<String, Long>> players = new TreeMap<>();

        int rows = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < rows; i++) {
            String[] line = scan.nextLine().split("\\s+");
            String name = line[0];
            String train = line[1];
            long kilo = Integer.parseInt(line[2]);

            if (!players.containsKey(name)) {
                players.put(name, new TreeMap<>());
            }

            if (!players.get(name).containsKey(train)) {
                players.get(name).put(train, kilo);
            } else {
                long kg = players.get(name).get(train) + kilo;
                players.get(name).put(train, kg);
            }
        }

        for (String player : players.keySet()) {
            System.out.print(player + " : ");

            ArrayList<String> output = new ArrayList<>();
            for (String exercise : players.get(player).keySet()) {
                output.add(String.format("%s - %d kg", exercise, players.get(player).get(exercise)));
            }
            System.out.println(output.toString().substring(1, output.toString().length() - 1));
        }
    }
}

