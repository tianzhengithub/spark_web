package org.example.tianzhen;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        final String[] tempStr = {""};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String temp = scanner.next();
            if (temp.equals("end")){
                break;
            }
            tempStr[0] = temp;
            System.out.println("最新结果是：" + tempStr[0]);
        }
        get("/hello", (req, res) -> tempStr[0]);
    }
}