package codingBat.string2;

public class MixString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "xyzyyy";
        System.out.println(mixString(a,b));
    }

    public static String mixString(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {

            // First choose the ith character of the
            // first string if it exists
            if (i < s1.length())
                result.append(s1.charAt(i));

            // Then choose the ith character of the
            // second string if it exists
            if (i < s2.length())
                result.append(s2.charAt(i));
        }
        return result.toString();
    }
}
