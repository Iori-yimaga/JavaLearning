package Leetcode;

public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int col = matrix.length, row = matrix[0].length;
        int nums = col * row, m = 0, n = 0;
        int[] res = new int[nums];
        boolean flag = true;

        for(int i = 0; i < nums; i ++){
            res[i] = matrix[m][n];
            if(flag){
                n += 1; m -= 1;
            }else{
                n -= 1; m += 1;
            }
            if(m >= col){
                m -= 1; n += 2; flag = true;
            }else if(n >= row){
                n -= 1; m += 2; flag = false;
            }
            if(m < 0){
                m = 0; flag = false;
            }else if(n < 0){
                n = 0; flag = true;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int A : findDiagonalOrder(arr)){
            System.out.print(A);
        }
    }
}
