import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Rafa", "Fabio", "Allan");

        nomes.stream().forEach(s -> System.out.println(2));
    }
}
