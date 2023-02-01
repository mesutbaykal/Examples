package practices;

import java.util.*;

public class Duplicate {

    public static void main(String[] args) {

        String str1="tea";
        String str2="tree";

        int result=getDuplicateValues(str1,str2);
        System.out.println(result);
    }

    static int getDuplicateValues(String str1, String str2){
        if (str1.length()==0||str2.length()==0){
            return 0;
        }
        int count=0;
        String duplicate="";

        List<String> word1=helper(str1);
        List<String> word2=helper(str2);
        System.out.println(word1+"\n"+word2);

        if (word1.size()<=word2.size()){
            for (int i = 0; i < word1.size(); i++) {
                for (int j = 0; j < word2.size(); j++) {
                    if (word1.get(i).equalsIgnoreCase(word2.get(j))){
                        duplicate+= word2.get(j);
                        count++;
                    }
                }
            }
        }
        System.out.println(duplicate);
        return count;
    }

    static List<String> helper(String str){
        Set<String> set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(String.valueOf(str.charAt(i)));
        }
        List<String> list=new ArrayList<>();
        return list;
    }
}
