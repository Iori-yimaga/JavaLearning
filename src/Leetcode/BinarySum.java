package Leetcode;

public class BinarySum {
    public static String BinarySum(String a, String b){
        return add2(a, b);
    }

    //那就使用简单思路，逐位相加
    private static String add2(String a, String b) {
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        int alen = cha.length;
        int blen = chb.length;
        //新建结果数组存放结果
        int len = Math.max(alen, blen);
        char[] res = new char[len + 1];//最长多一位
        //初始默认不进位
        boolean carry = false;
        //'0'为48，'1'为49
        for (int i = 1; i <= len; i ++) {
            int numa = 0, numb = 0;
            //先计算当前位上个数字的值
            if (alen - i >= 0)
                numa = cha[alen - i] - 48;
            if (blen - i >= 0)
                numb = chb[blen - i] - 48;
            //有进位则需多加1
            if (carry) {
                int sum = numa + numb + 1;
                //判断是否有进位
                if (sum < 2) {
                    res[res.length - i] = (char)(sum + 48);
                    carry = false;
                } else {
                    res[res.length - i] = (char)(sum - 2 + 48);
                    carry = true;
                }
            } else {
                int sum = numa + numb;
                if (sum < 2) {
                    res[res.length - i] = (char)(sum + 48);
                    carry = false;
                } else {
                    res[res.length - i] = (char)(sum - 2 + 48);
                    carry = true;
                }
            }
        }
        //最后还有进位
        if (carry) {
            res[0] = '1';
            return new String(res,0,res.length);
        } else
            return new String(res,1,res.length-1);//最后一个参数是生成子数组的长度
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(BinarySum(a, b));
    }
}
