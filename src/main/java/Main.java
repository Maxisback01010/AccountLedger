import java.io.BufferedReader;
import java.io.FileReader;
public class Main {
    public static void main(String[] args) {
        System.out.println("App started!");

        Transaction t = new Transaction(
                "2026-04-30",
                "15:45:00",
                "Software",
                "Gamestop",
                -82.75
        );
        System.out.println(t);

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

                System.out.println(transactionFromFile);
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
    }



}
