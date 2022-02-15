import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(7);
        integers.add(21);
        integers.add(8);
        printMultipliesOfThree(integers);

    }

    private static void printMultipliesOfThree(List<Integer> listOfIntegers) {
        listOfIntegers.stream()
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);


    }

}



