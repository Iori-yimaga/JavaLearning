package Leetcode;

/**
 * @Author Iori_yimaga
 * @Date 2019/12/11 9:23
 * BY Intellij IDEA
 */
public class ModeNumber {

    private static int multipleNumbers = 0;
    private static String mode;
    private static int medianNumber;

    private static String[] element = {"1","2","2","5","3","3","3","3","6"};
    private static void a(int start,int end){
        int mid = (start + end)/2;
        for(int i = start;i < end;i++){
            if(element[i].equals(element[mid])){
                medianNumber++;
                if(medianNumber > multipleNumbers){
                    multipleNumbers = medianNumber;
                    mode = element[mid];
                }
            }
        }
        if(mid > medianNumber){
            medianNumber = 0;
            a(0,mid);
        }
        if(end - mid - 1 > medianNumber){
            medianNumber = 0;
            a(mid + 1, end);
        }
    }
    public static void main(String[] args){
        a(0,element.length);
        System.out.println("重数：" + multipleNumbers + "众数：" + mode);
    }
}
