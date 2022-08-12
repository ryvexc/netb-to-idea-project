import java.io.IOException;
import java.io.OutputStream;

public class Instruction {

    public static void run(Lexer lex, String os_type) throws IOException {
        System.out.print("Checking os type...");
        if(os_type.equals("Linux") || os_type.equals("Windows")) System.out.println("\t[OK]");
        else System.out.println("\t[BAD] but not error.");

        System.out.print("Copying Netbeans Project's files...");
        if(os_type.equals("Linux")) {
            String[] args = new String[]{"cp", "-r", lex.selected_nbproj, lex.destination};
            Process proc = new ProcessBuilder(args).start();
            System.out.println("\t[OK]");
            System.out.println("Writing into Intellij Project...\t[OK]");
        } else if(os_type.equals("Windows")) {
            String[] args = new String[]{"xcopy", lex.selected_nbproj, lex.destination};
            Process proc = new ProcessBuilder(args).start();
            System.out.println("\t[OK]");
            System.out.println("Writing into Intellij Project...\t[OK]");
        } else {
            new Error("\nYour current os is not supported.").syswarn();
            new Error("System halted.").sysinfo();
            System.exit(0);
        }
    }
}
