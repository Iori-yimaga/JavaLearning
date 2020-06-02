/**
 * @author Iori_yimaga
 */
public class test11 {

    //将两个数组合并之后排序
    public static void main(String[] args){

        int[] data1 = {10,3,7,21,24};
        int[] data2 = {2,9,11,88};
        int[] data3 = new int[data1.length + data2.length];
        int temp = 0;
        System.arraycopy(data1,0,data3,0,data1.length);
        System.arraycopy(data2,0,data3,data1.length,data2.length);
        int curLen = data3.length;
        for(int i = 0;i < curLen - 1;i++){
            for(int j = 0;j < curLen - 1;j++){
                if(data3[j] > data3[j+1]){
                    temp = data3[j];
                    data3[j] = data3[j+1];
                    data3[j+1] = temp;
                }
            }
        }
        for(int i = 0;i < curLen;i++){
            System.out.print(data3[i] + " ");
        }
    }
}
