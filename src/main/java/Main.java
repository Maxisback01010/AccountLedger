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
                        parts[0].trim(),
                        parts[1].trim(),
                        parts[2].trim(),
                        parts[3].trim(),
                        Double.parseDouble(parts[4].trim())
                );
                transactions.add(transactionFromFile);



                //System.out.println(transactionFromFile);
                // System.out.println(parts[0]); // date
                // System.out.println(parts[1]); // time
                // System.out.println(parts[2]); // description
                // System.out.println(parts[3]); // vendor
                // System.out.println(parts[4]); // amount
            }

            reader.close();
            System.out.println("Total transactions loaded: " + transactions.size());

        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. View All Transactions");
            System.out.println("2. View Deposits");
            System.out.println("3. View Payments");
            System.out.println("4. Filter by Date"); // New
            System.out.println("5. Exit");    //Moved down

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                for (Transaction transaction : transactions) {
                    System.out.println(transaction);
                }
            }
            else if (choice == 2) {
                for (Transaction transaction : transactions) {
                    if (transaction.getAmount() > 0) {
                        System.out.println(transaction);
                    }
                }
            }
            else if (choice == 3) {
                for (Transaction transaction : transactions) {
                    if (transaction.getAmount() < 0) {
                        System.out.println(transaction);
                    }
                }
            }
            else if (choice == 4) {
                System.out.print("Enter a date (YYYY-MM-DD): ");
                scanner.nextLine(); // clears leftover newline
                String userDate = scanner.nextLine();

                for (Transaction transaction : transactions) {
                    System.out.println("Checking: " + transaction.getDate());

                    if (transaction.getDate().equals(userDate)) {
                        System.out.println("MATCH FOUND:");
                        System.out.println(transaction);
                    }
                }
            }

                else if (choice == 5) {
                running = false;
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid option.");
            }
        }
    }



}
