public class PrintPermutationsOfSring {
    public static void print(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <=ans.length(); i++) {
            String f=ans.substring(0,i);
            String s=ans.substring(i);
            print(str.substring(1),f+ch+s);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        print(str,new String());
    }
}
