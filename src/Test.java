public class Test {

    public static void main(String[] args) {
        String s1 = "ac" + "def";
        String s2 = new String(s1);
        if(s1.equals(s2)){
            System.out.println("equals()succeeded");
        }else if(s1 == s2){
            System.out.println("==succeeded");
        }
    }
}
