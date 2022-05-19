import java.util.Scanner;

public class Main {
    private static final String HELLO = "Привет";
    private static final String WRONG_INPUT = "Неверный ввод. Чтобы увидеть приветствие, введите число больше 7";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            input = input.trim();

            try {
                if (isInputNumberBiggerThanSeven(input)) {
                    System.out.println(HELLO);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }


    }

    public static boolean isInputNumberBiggerThanSeven(String input) {

        try {
            int number = Integer.parseInt(input);
            if (number > 7) {
                return true;
            } else {
                System.out.println(WRONG_INPUT);
                return false;
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException(WRONG_INPUT);

        } catch (NullPointerException e) {
            throw new NullPointerException(WRONG_INPUT);
        }

    }

}
