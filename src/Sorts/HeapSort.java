package Sorts;

/**
 * @Author Iori_yimaga
 * @Date 2019/10/15 18:26
 * BY Intellij IDEA
 */
public class HeapSort {

    /**
     * 堆排序
     * 平均时间复杂度：O(NlogN)
     * 由于每次重新恢复堆的时间复杂度为O(logN)，共N - 1次重新恢复堆操作
     * 再加上前面建立堆时N / 2次向下调整，每次调整时间复杂度也为O(logN)。二次操作时间相加还是O(N * logN)
     * */

    //构建最小堆
    public static void makeMinHeap(final int a[], final int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {
            minHeapFixdown(a, i, n);
        }
    }
    // 从i节点开始调整,n为节点总数 从0开始计算 i节点的子节点为 2*i+1, 2*i+2

    public static void minHeapFixdown(final int a[], int i, final int n) {

        // 子节点
        int j = 2 * i + 1;
        int temp = 0;

        while (j < n) {
            // 在左右子节点中寻找最小的
            if (j + 1 < n && a[j + 1] < a[j]) {
                j++;
            }

            if (a[i] <= a[j]) {
                break;
            }
            // 较大节点下移
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i = j;
            j = 2 * i + 1;
        }
    }

    public static void minHeapSort(final int a[], final int n) {
        int temp = 0;
        makeMinHeap(a, n);

        for (int i = n - 1; i > 0; i--) {
            temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            minHeapFixdown(a, 0, i);
        }
    }

    public static void main(final String[] args) {
        final int[] arr = { 4, 23, 7, 43, 66, 23, 75, 65, 34 };
        minHeapSort(arr, 9);
        for (final int a : arr) {
            System.out.print(a + " ");
        }
    }
}
