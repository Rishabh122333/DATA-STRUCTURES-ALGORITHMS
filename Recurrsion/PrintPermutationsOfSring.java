public class PrintPermutationsOfSring {
    public static void print(String str,String ans)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return ;
        }
        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
            String f=str.substring(0,i);
            String s=str.substring(i+1);
            print(f+s, ans+ch);

        }
        
    }

    public static void main(String[] args) {
        String str="abc";
        print(str,new String());
    }
}
