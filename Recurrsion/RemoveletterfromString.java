public class RemoveletterfromString {
    public static String remove(String str,int i,String ans)
    {
        if(i==str.length())
            return ans;
        if(str.charAt(i)=='a')
        {
            return remove(str, i+1, ans);
        }
        else
        {
            ans=ans+str.charAt(i);
            return remove(str,i+1,ans);
        }
    }

    public static void main(String[] args) {
        String str="amatheabaaeasaat";
        System.out.println(remove(str,0,new String()));
    }
}
