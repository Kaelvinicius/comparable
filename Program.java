import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 300));
        list.add(new Product("Xbox", 360));
        list.add(new Product("Fridge", 1300));

        //ArrowFunction
        //Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        //lambda expression
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product p : list ){
            System.out.println(p);
        }
    }
}
