import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("App started!");

        Transaction t = new Transaction(
                "2026-04-30",
                "15:45:00",
                "Software",
                "Gamestop",
                -82.75
        );
        System.out.println(t);
        ArrayList<Transaction> transactions = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                Transaction transactionFromFile = new Transaction(
                        parts[0],
                        parts[1],
                        parts[2],
                        parts[3],
                        Double.parseDouble(parts[4])
                );
                transactions.add(transactionFromFile);
                for (Transaction tFromList : transactions) {
                    System.out.println(tFromList);
                }

                //System.out.println(transactionFromFile);
                // System.out.println(parts[0]); // date
                // System.out.println(parts[1]); // time
                // System.out.println(parts[2]); // description
                // System.out.println(parts[3]); // vendor
                // System.out.println(parts[4]); // amount
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. View All Transactions");
            System.out.println("2. View Deposits");
            System.out.println("3. View Payments");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                for (Transaction transaction : transactions) {
                    System.out.println(transaction);
                }
            }
            else if (choice == 2) {
                // we’ll fill this next 👇
            }
            else if (choice == 3) {
                // we’ll fill this next 👇
            }
            else if (choice == 4) {
                running = false;
                System.out.println("Goodbye!");
            }
            else {
                System.out.println("Invalid option.");
            }
        }
    }



}
