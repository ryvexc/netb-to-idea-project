public class ValueCheck {
    protected static final String[] keywords = {"--select", "-s", "--to", "-t"};

    public static boolean isKeyword(String args) {
        for (String keyword : keywords) if (args.equals(keyword)) return true;
        return false;
    }
}
