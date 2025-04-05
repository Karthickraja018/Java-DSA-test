import java.util.HashSet;

public class Duplicates {
    public static int lastDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        int duplicate = -1;
        for(int num:nums){
            if(seen.contains(num)){
                duplicate = num;
            }
            else{
                seen.add(num);
            }
        }
        return duplicate;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,2,3,4,5,6,7};
        int result = lastDuplicate(nums);
        System.out.println(result);
    }
}
