import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04_SrabskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> venues = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] splitted = line.split("@");
            String name = splitted[0];
            if (name.charAt(name.length() - 1) != ' ') {
                line = scanner.nextLine();
                continue;
            }

            String[] venuesPrices = splitted[1].split(" ");
            if (venuesPrices.length < 3) {
                line = scanner.nextLine();
                continue;
            }

            int ticketsCount = 0;
            int ticketsPrice = 0;

            try {
                ticketsCount = Integer.parseInt(venuesPrices[venuesPrices.length - 1]);
                ticketsPrice = Integer.parseInt(venuesPrices[venuesPrices.length - 2]);
            } catch (Exception e) {
                line = scanner.nextLine();
            }

            String venue = "";
            for (int i = 0; i < venuesPrices.length - 2; i++) {
                venue += venuesPrices[i] + " ";
            }
            venue = venue.trim();

            if (!venues.containsKey(venue)) {
                venues.put(venue, new LinkedHashMap<>());
            }

            if (!venues.get(venue).containsKey(name)) {
                venues.get(venue).put(name, 0);
            }

            int ticketsSum = ticketsCount * ticketsPrice;

            venues.get(venue).put(name, venues.get(venue).get(name) + ticketsSum);

            line = scanner.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> v : venues.entrySet()) {
            System.out.println(v.getKey());

            v.getValue().entrySet().stream().sorted((t1, t2) -> t2.getValue().compareTo(t1.getValue())).forEach(entry -> {
                System.out.printf("#  %s -> %d", entry.getKey().trim(), entry.getValue());
                System.out.println();
            });

        }
    }
}
