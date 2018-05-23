import static spark.Spark.*;

public class SparkResources {
    public static void defineResources() {
        get("/", (req, res) -> "Hello World");
    }
}
