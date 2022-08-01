import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(1, "Sergiu");
        map.put(2, "Moses");
        System.out.println(map.get(2));

        System.out.println(findFirstUniqueChar("va developer"));

//        Map<String ,Integer>names=new HashMap<>();
//        names.put("ali",2);
//        names.put("vli",24);
//        names.put("adli",5);
//        names.put("acli",7);
//        System.out.println("names = " + names);

    }


    public static Character findFirstUniqueChar(String str){
        Map<Character,Integer>map=new HashMap<>();
        int count;
        for (Character ch:str.toCharArray()){
            if(map.containsKey(ch)){
                count=map.get(ch);
                map.put(ch,count+1);

            }else{
                map.put(ch,1);

            }
        }
        for (Character character: str.toCharArray()){
            if(map.get(character)==1)
                return character;
        }
        return null;

    }
}
