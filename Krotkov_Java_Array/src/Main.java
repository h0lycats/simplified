import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите числа для внесения в массив, разделив их запятой или пробелом");
            String input = scanner.nextLine();
            input = input.trim();

            printMultipliesOfThree(getListOfIntegers(input));

        }
    }

    private static void printMultipliesOfThree(List<Integer> listOfIntegers) {
        listOfIntegers.stream()
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);


    }

    private static List <Integer> getListOfIntegers (String input){
        List <Integer> integerList = new ArrayList<>();
        String regex = "([\\d]+)[\\,]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            integerList.add(Integer.parseInt(matcher.group(1)));
        }
    return integerList;}

}



