import java.io.IOException;
import java.io.OutputStream;

public class Instruction {

    public static void run(Lexer lex) throws IOException {
        String[] args = new String[]{"cp", "-r", lex.selected_nbproj, lex.destination};
        Process proc = new ProcessBuilder(args).start();
    }
}
