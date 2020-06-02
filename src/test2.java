public class test2 {
    public test2(){}

    //计算字符串中所有数字的和
    public static void main(String[] args) {
        String strData = "1ab23cde45f6";
        int sum = 0;
        String[] curData = strData.split("\\D");
        int myLen = curData.length;
        for(int i = 0;i < myLen;i++){
            try {
                String strTemp = curData[i];
                System.out.println(strTemp);
                int myInt = Integer.parseInt(strTemp);
                sum = sum + myInt;
            }
            catch(Exception e){}
        }
        System.out.println("The sum is:" + sum);
    }
}
