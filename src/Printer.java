import java.util.ArrayList;

public class Printer {
    public static void printArrList(String[] arr) {
        for(String c : arr) {
            System.out.printf("[%s] ", String.valueOf(c));
        }
    }

    public static void printInfo(Lexer lex) {
        System.out.println("OS: "+System.getProperty("os.name"));
        System.out.println("Source: "+lex.selected_nbproj.replaceAll("/src", ""));
        System.out.println("Destination: "+lex.destination.replaceAll("/src", ""));
//        System.out.println("Pwd: "+System.getProperty("user.dir"));
    }
}
