import java.util.HashMap;

public class test4 {
    public static void main(String[] args) {
        String str="dassafadggggggsddsaaffggggff";
        char[] chars=str.toCharArray();
        HashMap<Character,Integer> hm=new HashMap();
        for (char c:chars){
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='g'){
                if (!hm.containsKey(c)){
                    hm.put(c,1);
                }else {
                    hm.put(c,hm.get(c)+1);
                }
            }
        }
        for (Character key:hm.keySet()){
            System.out.println(key+"==="+hm.get(key));
        }
    }
}
