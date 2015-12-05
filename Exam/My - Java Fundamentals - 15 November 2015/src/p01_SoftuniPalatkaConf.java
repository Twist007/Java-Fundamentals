import java.util.Scanner;

public class p01_SoftuniPalatkaConf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleComing = Integer.parseInt(scan.nextLine());
        int rows = Integer.parseInt(scan.nextLine());
        int beds = 0;
        int foods = 0;

        for (int i = 0; i < rows; i++) {
            String[] line = scan.nextLine().split("\\s+");
            String sleepPlaces = line[0];
            int quantity = Integer.parseInt(line[1]);
            String type = line[2];

            switch (sleepPlaces) {
                case "tents":
                    if (type.equals("normal")) {
                        beds += quantity * 2;
                    } else {
                        beds += quantity * 3;
                    }
                    break;
                case "rooms":
                    if (type.equals("single")) {
                        beds += quantity * 1;
                    } else if (type.equals("double")) {
                        beds += quantity * 2;
                    } else {
                        beds += quantity * 3;
                    }
                    break;
                case "food":
                    if (type.equals("musaka")) {
                        foods += quantity * 2;
                    } else
                        break;
            }
        }

        if (peopleComing - beds > 0) {
            System.out.println("Some people are freezing cold. Beds needed: " + (peopleComing - beds));
        } else {
            System.out.println("Everyone is happy and sleeping well. Beds left: " + Math.abs(beds - peopleComing));
        }

        if (foods >= peopleComing) {
            System.out.println("Nobody left hungry. Meals left: " + (foods - peopleComing));
        } else {
            System.out.println("People are starving. Meals needed: " + (peopleComing - foods));
        }
    }
}













