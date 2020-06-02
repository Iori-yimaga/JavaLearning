package Sorts;

/**
 * @Author Iori_yimaga
 * @Date 2019/10/14 11:22
 * BY Intellij IDEA
 */
public class InsertionSort {

    /**
     * @Param int[] array
     * 原址排序
     * 从小到大
     *
     * 基本思想：
     * 在要排序的一组数中，假定前n-1个数已经排好序，现在将第n个数插到前面的有序数列中
     * 使得这n个数也是排好顺序的。如此反复循环，直到全部排好顺序。
     *
     * 平均时间复杂度：O(n2)
    */
    public static void insertionSort(int[] array){
        for(int i = 1;i < array.length;i++){
            int key = array[i];
            int j = i-1;
            while(j >=0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    /**
     * @Param int[] array
     * 原址排序
     * 从大到小
     */
    public static void insertionSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    //另一个版本
    //将arr[i] 插入到arr[0]...arr[i - 1]中
    public static void insertionSort3(int[] arr) {
        for (int i = 1; i < arr.length; i++ ) {
            int temp = arr[i];
            int j = i - 1;
            //如果将赋值放到下一行的for循环内, 会导致在第10行出现j未声明的错误
            for (; j >= 0 && arr[j] > temp; j-- ) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] A = {8,4,6,2,5,9,22,43,57};
        insertionSort(A);
        for(int B : A){
            System.out.print(B + " ");
        }
    }
}
