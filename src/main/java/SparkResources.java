import static spark.Spark.*;

public class SparkResources {
    public static void defineResources() {
        get("/", (req, res) -> "This is root page");
        get("/example", (req, res) -> "This is example page");
    }
}
