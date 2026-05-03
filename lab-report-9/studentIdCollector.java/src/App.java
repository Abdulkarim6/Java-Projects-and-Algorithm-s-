import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> studentIDs = new HashSet<>();

        studentIDs.add("10023");
        studentIDs.add("10024");
        studentIDs.add("10023");
        studentIDs.add("10025");
        studentIDs.add("10024");
        studentIDs.add("10026");

        System.out.println("Unique Student IDs:");
        for (String id : studentIDs) {
            System.out.println(id);
        }
    }
}
