package Leetcode;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        //首先就是获取当前数组的长度
        int n = digits.length;
        //将数组最后一位加1
        digits[n - 1] = digits[n - 1] + 1;
        //只要最后一位小于10，则直接输出当前数组
        if(digits[n - 1] < 10){
            return digits;
        }
        //如果最后一位值为10，则对整个数组进行遍历
        for(int i = n - 1; i >= 1; i--){
            if(digits[i] == 10){	//只要当前下标值等于10，就让当前下标值为0，并让前一个下标值加1
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;	//让前一个下标值加1
            }
        }
        //如果下标0的值为10，则需要创建一个新数组，容量比当前多1
        if(digits[0] == 10){
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;	//赋值下标0的值为1
            newDigits[1] = 0;	//赋值下标1的值为0
            for(int i = n; i >= 2; i--){	//进行循环，将之前的数组的值赋值给新数组，除了下标0和下标1
                newDigits[i] = digits[i - 1];
            }
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 6};
        for(int A : plusOne(arr)){
            System.out.print(A);
        }
    }
}
