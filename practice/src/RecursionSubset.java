public class RecursionSubset {
    public static void main(String[] args) {
        String s= "dataaaaaaakjka";
        String sb = noA(s);
        System.out.println(sb);
        String ans = delSkipwhennotCond("noapple","app","apple");
        System.out.println(ans);
    }


    static String noA(String s) {
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            return noA(s.substring(1));
        }else{
            return s.charAt(0)+noA(s.substring(1));
        }
    }

    static String noWord(String s,String skip) {
        if(s.isEmpty()){
            return "";
        }
//        if(s.startsWith(skip)){
//            return noWord(s.substring(skip.length()),skip);
//        }
        int len = skip.length();
        String newSb = s.substring(0,len);
        if(newSb.equals(skip)){
            return noWord(s.substring(len),skip);
        }
        return s.charAt(0) + noWord(s.substring(1),skip);
    }

    static String delSkipwhennotCond(String s,String skip,String cond) {
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith(skip) && !s.startsWith(cond)){
            return delSkipwhennotCond(s.substring(skip.length()),skip,cond);
        }
        return s.charAt(0) + delSkipwhennotCond(s.substring(1),skip,cond);
    }



}
