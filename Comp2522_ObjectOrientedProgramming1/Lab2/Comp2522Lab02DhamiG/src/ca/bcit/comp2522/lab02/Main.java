package ca.bcit.comp2522.lab02;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a birthdate
            Date dob1 = new Date(2000, 5, 15);
            Date dob2 = new Date(1995, 10, 30);
            Date dob3 = new Date(2010, 1, 20);

            // Test Dragon
            Dragon dragon = new Dragon("Smaug", dob1, 100, 80);
            System.out.println(dragon);
            try {
                int damage = dragon.breathFire();
                System.out.println("Dragon breathed fire and dealt " + damage + " damage!");
            } catch (Dragon.LowFirePowerException e) {
                System.out.println("Dragon failed to breathe fire: " + e.getMessage());
            }

            // Test Elf
            Elf elf = new Elf("Legolas", dob2, 85, 70);
            System.out.println(elf);
            try {
                int damage = elf.castSpell();
                System.out.println("Dragon breathed fire and dealt " + damage + " damage!");
            } catch (Elf.LowManaException e) {
                System.out.println("Elf failed to cast spell: " + e.getMessage());
            }

            // Test Orc
            Orc orc = new Orc("Gorbag", dob3, 120, 90);
            System.out.println(orc);
            orc.berserk();

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
