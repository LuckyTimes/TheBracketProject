public class Main {
    public static void main(String[] args) {
        //* {@code "({([()]]})"} - {@code false}
        // * {@code "()([()]{})"} - {@code true}
        // * {@code "[(])"} - {@code false}
        new ParseString("[(])");

        Bracket braketCircle = new Bracket("(", ")");
        Bracket braketSquare = new Bracket("[","]");
        Bracket braketBrace = new Bracket("[","]");

        boolean answer = ParseString.Find(braketCircle,braketSquare,braketBrace);

        System.out.println(answer);
    }
}
