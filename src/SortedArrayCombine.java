/**
 * @Author Iori_yimaga
 * @Date 2019/10/31 18:04
 * BY Intellij IDEA
 */
public class SortedArrayCombine {

    public static void main(String[] args) {

        // TODO, add your application code
        int[] a={2,4,10,22,34};
        int[] b={1,5,12,26,38,100,101};
        //将这两个数组合并成一个有序数组c,且c中的数从小到大排列。
        //只能使用一层循环。
        int[] c=new int[a.length + b.length];
        int pa = 0;
        int pb = 0;
        for(int i = 0;i < c.length;i++){
            if(pa < a.length && pb < b.length){
                if(a[pa] > b[pb]){
                    c[i] = b[pb];
                    pb++;
                }else{
                    c[i] = a[pa];
                    pa++;
                }
            }else if(pa < a.length){
                c[i] = a[pa];
                pa++;
            }else if(pb < b.length){
                c[i] = b[pb];
                pb++;
            }
        }
        for(int d : c){
            System.out.print(d + " ");
        }
    }
}
