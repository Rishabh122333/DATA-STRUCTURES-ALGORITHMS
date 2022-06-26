public class CountPermutationsOfString {
    static int count(String ans, String str) {
        if (str.isEmpty()) {
            return 1;
        }
        int c = 0;
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i);
            c +=count(f + ch + s, str.substring(1));
        }
        return c;
    }

    public static void main(String[] args) {
        String str="abc";
        System.out.println(count(new String(),str));
    }
}
