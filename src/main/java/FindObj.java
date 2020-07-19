public class FindObj {
    private static char lastBracket;
    private static boolean ret;

    public static boolean compare(char arg, Bracket braketCircle, Bracket braketSquare, Bracket braketBrace){
        switch (arg) {
            case '(':
                braketCircle.setCountOpenPlusOne();
                lastBracket = '(';
                break;
            case '[':
                braketSquare.setCountOpenPlusOne();
                lastBracket = '[';
                break;
            case '{':
                braketBrace.setCountOpenPlusOne();
                lastBracket = '{';
                break;
            case ')':
                if (lastBracket != '(') {return false;}
                braketCircle.setCountOpenMinusOne();
                break;
            case ']':
                if (lastBracket != '{') {return false;}
                braketSquare.setCountOpenMinusOne();
                break;
            case '}':
                if (lastBracket != '{') {return false;}
                braketBrace.setCountOpenMinusOne();
                break;

            default:
                break;
        }
        lastBracket = arg;
        return true;
    }
}
