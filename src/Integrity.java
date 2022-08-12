public class Integrity {
    public static void check(Lexer lex) {
        System.out.print("Checking Integrity...");
        if(lex.selected_nbproj == null) {
            new Error("Source not defined. (null).").syserr();
            new Error("System halted.").sysinfo();
            System.out.println("\t[BAD]");
            System.exit(0);
        } else if(lex.destination == null) {
            new Error("Destination not defined. (null).").syserr();
            new Error("System halted.").sysinfo();
            System.out.println("\t[BAD]");
            System.exit(0);
        }
        System.out.println("\t[OK]");
    }
}
