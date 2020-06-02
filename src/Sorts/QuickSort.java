package Sorts;

/**
 * @Author Iori_yimaga
 * @Date 2019/10/15 16:54
 * BY Intellij IDEA
 */
public class QuickSort {

    private static int count;

    public static void main(String[] args) {

        int[] num = {3,45,78,64,52,11,64,55,99,11,18};
        System.out.println(arrayToString(num,"未排序"));
        quickSort(num,0,num.length-1);
        System.out.println(arrayToString(num,"排序"));
        System.out.println("数组个数：" + num.length);
        System.out.println("循环次数：" + count);
    }

    /**
     *  快速排序
     * @Param num
     * @Param left
     * @Param right
     *
     * 基本思想：（分治）
     * 先从数列中取出一个数作为key值；
     * 将比这个数小的数全部放在它的左边，大于或等于它的数全部放在它的右边；
     * 对左右两个小数列重复第二步，直至各区间只有1个数。
     *
     * 辅助理解：挖坑填数
     * 初始时 i = 0; j = 9; key=72
     * 由于已经将a[0]中的数保存到key中，可以理解成在数组a[0]上挖了个坑，可以将其它数据填充到这来。
     * 从j开始向前找一个比key小的数。当j=8，符合条件，a[0] = a[8] ; i++ ; 将a[8]挖出再填到上一个坑a[0]中。
     * 这样一个坑a[0]就被搞定了，但又形成了一个新坑a[8]，这怎么办了？简单，再找数字来填a[8]这个坑。
     * 这次从i开始向后找一个大于key的数，当i=3，符合条件，a[8] = a[3] ; j-- ; 将a[3]挖出再填到上一个坑中。
     *
     * 数组：72 - 6 - 57 - 88 - 60 - 42 - 83 - 73 - 48 - 85
     *  0   1   2    3    4    5    6    7    8    9
     *
     * 此时 i = 3; j = 7; key=72
     * 再重复上面的步骤，先从后向前找，再从前向后找。
     * 从j开始向前找，当j=5，符合条件，将a[5]挖出填到上一个坑中，a[3] = a[5]; i++;
     * 从i开始向后找，当i=5时，由于i==j退出。
     * 此时，i = j = 5，而a[5]刚好又是上次挖的坑，因此将key填入a[5]。
     *
     * 数组：48 - 6 - 57 - 88 - 60 - 42 - 83 - 73 - 88 - 85
     *  0   1   2    3    4    5    6    7    8    9
     *
     * 可以看出a[5]前面的数字都小于它，a[5]后面的数字都大于它。因此再对a[0…4]和a[6…9]这二个子区间重复上述步骤就可以了。
     *
     * <数组：48 - 6 - 57 - 42 - 60 - 72 - 83 - 73 - 88 - 85
     *  0   1   2    3    4    5    6    7    8    9
     *
     *平均时间复杂度：O(N*logN)
     * */
    public static void quickSort(int[] num,int left,int right){
        //如果left等于right，即数组只有一个元素，直接返回
        if(left >= right){return;}
        //设置最左边的元素为基准值
        int key = num[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为L
        int L = left;
        int R = right;
        while(L < R){
            //R向左移，直到遇到比key小的值
            while(num[R] >= key && L < R){R--;}
            //L向右移，直到遇到比key大的值
            while(num[L] <= key && L < R){L++;}
            //L和R指向的元素交换
            if(L < R){
                int temp = num[L];
                num[L] = num[R];
                num[R] = temp;
            }
        }
        num[left] = num[L];
        num[L] = key;
        count++;
        quickSort(num,left,L-1);
        quickSort(num,L+1,right);
    }

    /**
     *  将一个int类型的数组转化为字符串
     * @Param arr
     * @Param flag
     * @return
     * */
    private static String arrayToString(int[] arr,String flag){
        String str = "数组为("+flag+"): ";
        for(int a : arr){
            str += a +"\t";
        }
        return str;
    }
}
