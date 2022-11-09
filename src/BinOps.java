public class BinOps {
    public String sum(String a, String b) {
        int one = convert(a);
        int two = convert(b);
        int t = one + two;
        String target = Integer.toString(t);
        return target;
    }

    public String mult(String a, String b) {
        int one = convert(a);
        int two = convert(b);
        int t = one * two;
        String target = Integer.toString(t);
        return target;
    }

    public static int convert(String string) {
        int i;
        try {
            i = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            i = 0;
        }
        return i;
    }
}
