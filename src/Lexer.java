public class Lexer {
    protected String basic_input[], selected_nbproj, destination;
    public Lexer(String[] basic_input) {
        this.basic_input = basic_input;
    }

    public Lexer parse() {
        try {
            for (int i = 0; i < this.basic_input.length; i++) {
                if (this.basic_input[i].equals("--select") || this.basic_input[i].equals("-s")) {
                    if (!ValueCheck.isKeyword(this.basic_input[i + 1])) {
                        this.selected_nbproj = this.basic_input[i + 1]+"/src";
                        i++;
                    } else {
                        new Error("It's keyword, you can't use two times").syserr();
                        new Error("System halted.").sysinfo();
                        System.exit(0);
                    }
                } else if (this.basic_input[i].equals("--to") || this.basic_input[i].equals("-t")) {
                    if (!ValueCheck.isKeyword(this.basic_input[i + 1])) {
                        this.destination = this.basic_input[i + 1];
                        i++;
                    } else {
                        new Error("It's keyword, you can't use two times").syserr();
                        new Error("System halted.").sysinfo();
                        System.exit(0);
                    }
                } else {
                    new Error("Please define the nbproj and ideaproj first.").syswarn();
                    new Error("System halted.").sysinfo();
                    System.exit(0);
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            new Error("Unknown Error, please enter a full command.").syserr();
            new Error("System halted.").sysinfo();
            System.exit(0);
        }

        return this;
    }
}
