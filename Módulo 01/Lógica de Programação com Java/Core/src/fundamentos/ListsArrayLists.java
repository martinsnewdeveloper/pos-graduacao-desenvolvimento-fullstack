package fundamentos;
import java.util.ArrayList;

public class ListsArrayLists {
    public static void main(String[] args) {
        ArrayList<String> times = new ArrayList<>();
        times.add("Barcelona");
        times.add("Real Madrid");
        times.add("Manchester City");
        times.add("Manchester United");

        times.remove("Barcelona");

        times.contains("Real Madrid"); // true ou false

        System.out.println(times);
    }
}
