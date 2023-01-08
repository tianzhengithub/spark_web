package org.example.tianzhen;
import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "hello sparkWeb 111");
    }
}