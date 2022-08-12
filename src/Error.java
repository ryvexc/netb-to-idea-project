public class Error {
    String message;

    public Error(String message) {
        this.message = message;
    }
    public void syserr() {
        System.err.printf("rynetin: error: %s\n", this.message);
    }

    public void sysinfo() {
        System.err.printf("rynetin: %s\n", this.message);
    }

    public void syswarn() {
        System.err.printf("rynetin: warning: %s\n", this.message);
    }
}
