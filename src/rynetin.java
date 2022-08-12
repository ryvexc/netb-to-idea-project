import java.io.IOException;
import java.util.Scanner;

public class rynetin {
    public static void main(String[] args) throws IOException {
        if(args.length > 0) isAnyArgs(args);
        else noArgs();
    }

    private static Scanner scanner = new Scanner(System.in);

    private static final void isAnyArgs(String[] main_args) throws IOException {
        Lexer lex = new Lexer(main_args).parse();
        Printer.printInfo(lex);
        Integrity.check(lex);
        Instruction.run(lex, System.getProperty("os.name"));
        System.out.println("Done, Exit.");
    }

    private static final void noArgs() throws IOException {
        System.out.print("netbeans project path: ");
        String nb_path = scanner.nextLine();
        System.out.print("intellij project path: ");
        String idea_path = scanner.nextLine();

        Lexer lex = new Lexer(new String[]{"--select", nb_path, "--to", idea_path}).parse();
        Printer.printInfo(lex);
        Integrity.check(lex);
        Instruction.run(lex, System.getProperty("os.name"));
        System.out.println("Done, Exit.");
    }
}
