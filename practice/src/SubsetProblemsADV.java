import java.util.*;

public class SubsetProblemsADV {
    public static void main(String[] args) {
        String s = "abs";
        ArrayList<String> arr = subsetGenInList("","abc");
        System.out.println(arr);
    }

    static void subsetGen(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subsetGen(p+up.charAt(0),up.substring(1));
        subsetGen(p,up.substring(1));
    }


    static ArrayList<String> subsetGenInList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add(p);
            return temp;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =  subsetGenInList(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = subsetGenInList(p,up.substring(1));
        left.addAll(right);
//        left.addAll(mid);
        return left;



    }


}
