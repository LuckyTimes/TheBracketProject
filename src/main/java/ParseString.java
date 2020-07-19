public class ParseString {
    private static boolean answer = true;
    private static String input;

    public ParseString(String arg){
        input = arg;
    }

    public static boolean Find(Bracket braketCircle, Bracket braketSquare, Bracket braketBrace){

        for (int i = 0; i < input.length(); i++){
            if (answer) {
                answer = FindObj.compare(input.charAt(i),braketCircle,braketSquare,braketBrace);
            } else {
                return false;
            }
        }

        return answer;
    }
}
