package Sorts;

/**
 * @Author Iori_yimaga
 * @Date 2019/10/15 17:55
 * BY Intellij IDEA
 */
public class SelectionSort {

    /**
     * 选择排序
     * 基本思想：
     * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
     * 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
     * 。。。
     * 第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成
     *
     * 平均时间复杂度：O(n2)
     *
     * @Param array
     * @Param length
     * */
    public static void select_sort(int array[],int lenth){

        for(int i=0;i<lenth-1;i++){

            int minIndex = i;
            for(int j=i+1;j<lenth;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {3,45,78,64,52,11,64,55,99,11,18};
        select_sort(num,11);
        for(int A : num){
            System.out.print(A + " ");
        }
    }
}
