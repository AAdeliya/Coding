public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("banana"));
    }

    public static String reverseString(String str) {
        StringBuilder res = new StringBuilder();

        for (int i = str.length(); i >= 0; i++) {
            res.append(str.charAt(i));
        }

        return res.toString();
    }
}
