import java.util.ArrayList;
import java.util.List;

public class CombinationalSumGFG {
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        int target=8;
        System.out.println(combinations(arr,target,0,new ArrayList<Integer>()));
    }
    public static List<List<Integer>> combinations(int arr[],int target,int i,List<Integer> list)
    {
        if(i==arr.length)
        {
            List<List<Integer>> ans=new ArrayList<>();
            if(target==0)
            {
                ans.add(new ArrayList<>(list));
            }
            return ans;
        }
        List<List<Integer>> ans=new ArrayList<>();
        if(arr[i]<=target)
        {
            list.add(arr[i]);
            ans.addAll(combinations(arr, target-arr[i], i, list));
            list.remove(list.size()-1);
        }
        ans.addAll(combinations(arr, target, i+1, list));
        return ans;
    }
}
