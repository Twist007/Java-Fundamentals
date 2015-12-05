import java.util.*;

public class p04_Nuts21Sept2014Morning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        TreeMap<String, LinkedHashMap<String, Integer>> companies = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String[] line = scan.nextLine().split(" ");
            String company = line[0];
            String nuts = line[1];
            String amountAsString = line[2].replaceAll("\\D+", "");
            int amount = Integer.parseInt(amountAsString);

            if (!companies.containsKey(company)) {
                companies.put(company, new LinkedHashMap<>());
            }
            if (companies.get(company).containsKey(nuts)) {
                int oldAmount = companies.get(company).get(nuts);
                companies.get(company).put(nuts, amount + oldAmount);
            } else {
                companies.get(company).put(nuts, amount);
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> pair : companies.entrySet()) {
            System.out.print(pair.getKey() + ": ");

            StringBuilder out = new StringBuilder();
            for (Map.Entry<String, Integer> innerPair : pair.getValue().entrySet()) {
                out.append(innerPair.getKey() + "-" + innerPair.getValue() + "kg, ");
            }
            String outputString = out.toString().substring(0, out.length() - 2);
            System.out.println(outputString);
        }
    }
}
