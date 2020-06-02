import java.util.Arrays;

public class FindDoubleMaxNumber {
    public static int dominantIndex(int[] nums) {
        int[] temp = nums;
        Arrays.sort(temp);
        int n = nums.length;
        if(temp[n-1] >= temp[n-2]){
            int p = temp[n-1];
            int j = getIndex(nums, p);
            return j;
        }else{
            return -1;
        }
    }

    public static int getIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {6,3,8,2,9};
        int flag = dominantIndex(nums);
        System.out.println(flag);
    }
}
