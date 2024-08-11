import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetGenItr {
    public static void main(String[] args) {
        List<List<Integer>> ans = subsetsWithDuplicates(new int[]{1,2,2});
        for (List<Integer> L: ans){
            System.out.println(L);
        }



    }
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : nums) {
            int n = outer.size();
            for(int i = 0 ; i<n; i++){
                List<Integer> nw = new ArrayList<>(outer.get(i));
                nw.add(num);
                outer.add(nw);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetsWithDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int j= 0 ; j<nums.length; j++) {
            int n = outer.size();
            int temp = n/2;
            if(j>0 && nums[j]==nums[j-1] ) {
                for (int i = temp; i < n; i++) {
                    List<Integer> nw = new ArrayList<>(outer.get(i));
                    nw.add(nums[j]);
                    outer.add(nw);
                }
            }
            else{
                for (int i = 0; i < n; i++) {
                    List<Integer> nw = new ArrayList<>(outer.get(i));
                    nw.add(nums[j]);
                    outer.add(nw);
                }

            }
        }
        return outer;
    }
}
