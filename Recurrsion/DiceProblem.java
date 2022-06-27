import java.util.ArrayList;
import java.util.List;

public class DiceProblem {
    static List<Integer> dice(String ans,int sum){
        if(sum==0)
        {
            List<Integer> list=new ArrayList<>();
            list.add(Integer.parseInt(ans));
            return list;
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i <=sum; i++) {
            list.addAll(dice(ans+i,sum-i));
        }
        return list;
    }
    public static void main(String[] args) {
        int sum=4;
        System.out.println(dice(new String(),sum));
    }
}
