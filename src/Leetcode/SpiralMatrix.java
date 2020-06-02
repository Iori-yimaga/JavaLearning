package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOlder(int[][] matrix) {
        ArrayList<Integer> list= new ArrayList<>();
        if(matrix==null||matrix.length==0){
            return list;
        }
        int row=matrix.length;
        int col=matrix[0].length;
        boolean[][] status=new boolean[row][col];
        int len=row*col;
        int x=0,y=0;
        while(true){
            if(list.size()==len){
                break;
            }
            //向右
            while(y<col&&!status[x][y]&&list.size()<len){
                list.add(matrix[x][y]);
                status[x][y]=true;
                y++;
            }
            y--;
            x++;
            //向下
            while(x<row&&!status[x][y]&&list.size()<len){
                list.add(matrix[x][y]);
                status[x][y]=true;
                x++;
            }
            x--;
            y--;
            //向左
            while(y>=0&&!status[x][y]&&list.size()<len){
                list.add(matrix[x][y]);
                status[x][y]=true;
                y--;
            }
            y++;
            x--;
            //向上
            while(x>=0&&!status[x][y]&&list.size()<len){
                list.add(matrix[x][y]);
                status[x][y]=true;
                x--;
            }
            x++;
            y++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> temp = spiralOlder(arr);
        System.out.println(temp);

    }
}
