public class PrintSubsetsofString {
    public static void print(String str, String ans)
    {
        if(str.isEmpty())
        {
            System.out.print(ans +" ");
            return;
        }
        char ch=str.charAt(0);
        print(str.substring(1),ans);
        print(str.substring(1),ans+ch);
    }

    public static void main(String[] args) {
        String str="abc";
        print(str,new String());
    }
}
