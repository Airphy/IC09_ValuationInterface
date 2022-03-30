import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // collection of stocks and bonds
        List<Security> portfolio = new ArrayList<>();

        portfolio.add(new CommonStock("1234567", "Apple Inc.", 100, 100.0, 134.89));
        portfolio.add(new Bond("114567", "US GOV", 100, 3.0, 3));

        System.out.println("~~~Unsorted Portfolio~~~");
        for (Security s : portfolio)
            System.out.println(s);

        System.out.println("~~~Sorted Portfolio~~~");
        for (Security s : portfolio)
            System.out.println(s);
    }
}
