package org.example.tianzhen;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "hello sparkWeb");
    }
}