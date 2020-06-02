public class validPro {
    public static void main(String[] args) {

        int i = 0;
        i = i++;
        System.out.println(i);

        // 相当于在int池中开辟了一个临时变量
        // 然后赋值给i
        int temp1 = i++;
        System.out.println(temp1);
    }
}
