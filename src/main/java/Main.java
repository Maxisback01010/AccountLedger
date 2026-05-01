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
                System.out.println(line); // just print for now
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
