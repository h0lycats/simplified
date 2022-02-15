import java.util.Scanner;

public class Main {
    private static final String HELLO = "Привет";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            input = input.trim();


            if (input.equals("7")) {
                System.out.println(HELLO);
            }


        }


    }

}
