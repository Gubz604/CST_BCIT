package ca.bcit.comp2522.lab01;

public class Main {
    public static void main(String[] args) {
        // Albert Einstein
        Name name1 = new Name("Albert", "Einstein");
        Date birth1 = new Date(1879, 3, 14);
        Date death1 = new Date(1955, 4, 18);
        Person person1 = new Person(name1, birth1, death1);
        BankClient client1 = new BankClient(name1, birth1, new Date(1900, 1, 28),"A14502");
        BankAccount account1 = new BankAccount(3141,
                                               new Date(1900, 1, 28),
                                               client1, 1000,
                                               new Date(1950, 10, 14));
        account1.withdraw(100);

        printDetails(client1, account1);

        // Nelson Mandela
        Name name2 = new Name("Nelson", "Mandela");
        Date birth2 = new Date(1918, 7, 18);
        Date death2 = new Date(2013, 12, 5);
        Person person2 = new Person(name2, birth2, death2);
        BankClient client2 = new BankClient(name2, birth2, new Date(1994, 5, 10), "654321");
        BankAccount account2 = new BankAccount(4664,
                                               new Date(1994, 5, 10),
                                               client2, 2000,
                                               null); // Still open
        account2.withdraw(200);
        printDetails(client2, account2);

        // Frida Kahlo
        Name name3 = new Name("Frida", "Kahlo");
        Date birth3 = new Date(1907, 7, 6);
        Date death3 = new Date(1954, 7, 13);
        Person person3 = new Person(name3, birth3, death3);
        BankClient client3 = new BankClient(name3, birth3, new Date(1940, 1, 1), "frd123");
        BankAccount account3 = new BankAccount(1907,
                                               new Date(1940, 1, 1),
                                               client3, 500,
                                               new Date(1954, 7, 13));
        account3.withdraw(50);
        printDetails(client3, account3);

        // Jackie Chan
        Name name4 = new Name("Jackie", "Chan");
        Date birth4 = new Date(1954, 4, 7);
        Person person4 = new Person(name4, birth4, null); // Still alive
        BankClient client4 = new BankClient(name4, birth4, new Date(1980, 10, 1), "chan789");
        BankAccount account4 = new BankAccount(1954,
                                               new Date(1980, 10, 1),
                                               client4, 3000,
                                               null); // Still open
        account4.withdraw(500);
        printDetails(client4, account4);
    }

    public static void printDetails(BankClient client, BankAccount account) {
        Name name = client.getName();
        System.out.println("Initials: " + name.getInitials());
        System.out.println("Full Name: " + name);
        System.out.println("Reversed Name: " + name.getReverseName());
        System.out.println(client.getDetails());
        System.out.println(client.getDetails());
        System.out.println(account.getDetails());
        System.out.println();
    }
}
