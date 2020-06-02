/***
 * @Author Iori_yimaga
 * @Date 2020/3/17
 * BY Intellij IDEA
 */
public class SwitchTwoStrings {

    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "guides";

        //use third variable
        /*String temp;
        temp = s1;    //java
        s1 = s2;      //guides
        s2 = temp;    //java*/

        //not use third variable
        //step 1 : concat s1 + s2 and s1
        s1 = s1 + s2;   //javaguides   //10
        //step 2 : store initial value of s1 into s2
        s2 = s1.substring(0, s1.length() - s2.length());  //0, 10-6 //java
        //step 3 : stroe initial value of s2 into s1
        s1 = s1.substring(s2.length());

        System.out.println(" After swapping two strings ");
        System.out.println(" s1 => " + s1);
        System.out.println(" s2 => " + s2);
    }
}
