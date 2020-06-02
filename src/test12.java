/**
 * @author Iori_yimaga
 */
public class test12 {

    //计算1/1! + 1/3！+ 1/5! + 1/7! + 1/9! + 1/11!的和
    public static void main(String[] args) {
        double sum = 0;
        double curData;
        for(int i = 1;i < 7;i++){
            curData = 1 / (double)factorial(2 * i -1);
            sum = sum + curData;
        }
        System.out.println("The sum is:" + sum);
    }
    public static int factorial(int n){
        if(n == 1){return 1;}
        else{return (n * factorial(n - 1));}
    }
}
