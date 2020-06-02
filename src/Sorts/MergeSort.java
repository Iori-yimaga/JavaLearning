package Sorts;

/**
 * @Author Iori_yimaga
 * @Date 2019/10/15 16:10
 * BY Intellij IDEA
 */

public class MergeSort {

    /**
     * 归并排序
     * 基本思想：参考
     * 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法的一个非常典型的应用
     * 首先考虑下如何将2个有序数列合并。这个非常简单，只要从比较2个数列的第一个数，谁小就先取谁
     * 取了后就在对应数列中删除这个数。然后再进行比较，如果有数列为空，那直接将另一个数列的数据依次取出即可
     *
     * 解决了上面的合并有序数列问题，再来看归并排序，其的基本思路就是将数组分成2组A，B
     * 如果这2组组内的数据都是有序的，那么就可以很方便的将这2组数据进行排序。如何让这2组组内数据有序了？
     *
     * 可以将A，B组各自再分成2组。依次类推，当分出来的小组只有1个数据时
     * 可以认为这个小组组内已经达到了有序，然后再合并相邻的2个小组就可以了。这样通过先递归的分解数列，再合并数列就完成了归并排序。
     *
     * 平均时间复杂度：O(NlogN)
     * 归并排序的效率是比较高的，设数列长为N，将数列分开成小数列一共要logN步
     * 每步都是一个合并有序数列的过程，时间复杂度可以记为O(N)，故一共为O(N*logN)
     *
     * @Param arr
     * @Param start
     * @Param mid
     * @Param end
     *
     * */
    public static void Merge(int[] array,int start,int mid,int end){
        //声明一个临时数组，长度为要归并数组的长度
        int[] temp = new int[end-start+1];
        //左边数组第一个元素的下标
        int L = start;
        //右边数组第一个元素的下标
        int R = mid + 1;
        int k = 0;
        while(L <= mid && R <= end){
            //左边数组和右边数组元素比较，把小的元素赋给临时数组
            if(array[L] <= array[R]){
                temp[k++] = array[L++];
            }else{
                temp[k++] = array[R++];
            }
        }

        //把左边剩余的元素赋给临时数组
        while(L <= mid){temp[k++] = array[L++];}

        //把右边剩余的元素赋给临时数组
        while(R <= end){temp[k++] = array[R++];}

        //用临时数组元素覆盖原始数组
        for(int k2 = 0;k2 < temp.length;k2++){
            array[k2+start] = temp[k2];
        }
    }

    /**
     * 递归排序
     * @Param array
     * @Param start
     * @Param end
     * */
    public static void Merge_sort(int[] array,int start,int end) {
        int mid = (start + end)/2;
        if(start < end){
            //递归解决前半部分
            Merge_sort(array, start, mid);
            //递归解决后半部分
            Merge_sort(array,mid+1,end);
            //将所有有序数组完成归并
            Merge(array,start,mid,end);
        }
    }

    public static void main(String[] args) {
        int[] A = {5,2,4,7,1,3,2,6};
        System.out.println("原始数据： ");
        for(int B : A){
            System.out.print(B + " ");
        }
        System.out.println();
        Merge_sort(A,0,A.length-1);
        System.out.println("输出结果： ");
        for(int B : A){
            System.out.print(B + " ");
        }
    }
}
