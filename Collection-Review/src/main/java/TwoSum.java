import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 9, 24}, 33);
        System.out.println(Arrays.toString(ints));

        System.out.println(Arrays.toString(twoSum2(new int[]{2, 7, 9, 24}, 33)));
    }

    public static int[] twoSum(int [] arr, int target){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
            for (int j = 1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target) return new int[]{i,j};
            }
        }
        return null;
    }

    public static int[] twoSum2(int [] arr, int target){
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int potentialMatch=target-arr[i];
            if(map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            else map.put(arr[i],i);
        }

        return new int[]{};
    }
}
