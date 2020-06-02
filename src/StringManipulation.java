/**
 * @Author Iori_yimaga
 * @Date 2020/03/14 13:28
 * BY Intellij IDEA
 */
public class StringManipulation{

    public static void StrManipulation(){
        String str = ".spleh A+lrtC/dmC .thgis fo tuo si ti semitemos ,etihw si txet nehw sa drah kooL .tseretni wohs dluohs uoy ecalp a si ,dessecorp si xat hctuD erehw esac ehT .sedih tseuq fo txen eht erehw si ,deificeps era segaugnal cificeps-niamod tcudorp ehT" ;
        String[] split = str.split(" ");
        String result = "";
        for(int i = 0;i < split.length;i++){
            result += new StringBuffer(split[split.length - 1 - i]).reverse() + " ";

        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        StrManipulation();
    }
}
