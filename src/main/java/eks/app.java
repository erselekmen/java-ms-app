package eks;
import static spark.Spark.get;

public class app {
    public static void main(String[] args) {
        get("/", (req, res) -> {
            return "Hello World!";
        });
    }
}