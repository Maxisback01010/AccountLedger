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
    }

}
