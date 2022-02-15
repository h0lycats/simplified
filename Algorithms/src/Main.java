import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String WRONG_NAME = "Такого имени нет";
    private static final String CORRECT_NAME = "Привет, Вячеслав";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            input = input.trim();
            String toPrint = verifyName(input);
            System.out.println(toPrint);
        }


    }

    private static String verifyName(String name) {
        String regexForNameVerifying = "([В,в]ячеслав)";
        Pattern pattern = Pattern.compile(regexForNameVerifying);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            return CORRECT_NAME;
        }

        return WRONG_NAME;

    }


}


