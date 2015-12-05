/**
 * Created by Hristiyan Bratoev on 29-Oct-15.
 */
public class Main {
    public static void main(String[] args) {
        GameCharacter goshoTheWarrior = new Warrior("Gosho");
        GameCharacter peshoTheMage = new Mage("Pesho");

        int roundCount = 0;
        while (true) {
            System.out.println("Round: " + ++roundCount);
            try {
                if (roundCount % 2 == 0) {
                    goshoTheWarrior.attack(peshoTheMage);
                    peshoTheMage.attack(goshoTheWarrior);
                } else {
                    peshoTheMage.attack(goshoTheWarrior);
                    goshoTheWarrior.attack(peshoTheMage);
                }

                System.out.println("Warrior health -> " + goshoTheWarrior.getHealth());
                System.out.println("Mage health -> " + peshoTheMage.getHealth());

                System.out.println("Warrior energy -> " + goshoTheWarrior.getEnergy());
                System.out.println("Mage energy -> " + peshoTheMage.getEnergy());

            } catch (OutOfEnergyExceptions e) {
                e.printStackTrace();

                System.out.println();
                System.out.println(e.getMessage());

                break;
            }

            System.out.println();
        }

        System.out.println();

        if (peshoTheMage.getHealth() > goshoTheWarrior.getHealth()) {
            System.out.println("Winner is " + peshoTheMage.getName());
        } else {
            System.out.println("Winner is " + goshoTheWarrior.getName());
        }
    }
}
