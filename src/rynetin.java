import java.io.IOException;
import java.util.Scanner;

public class rynetin {
    public static void main(String[] args) throws IOException {
        if(args.length > 0) {
            isAnyArgs(args);
        } else {
            System.out.println("No args");
        }
    }

    private static Scanner scanner = new Scanner(System.in);

    private static final void isAnyArgs(String[] main_args) throws IOException {
        Lexer lex = new Lexer(main_args).parse();
        Printer.printInfo(lex);
        Integrity.check(lex);
        Instruction.run(lex);
    }
}
