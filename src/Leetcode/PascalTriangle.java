package Leetcode;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static @NotNull
    List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list_All = new ArrayList<>();
        if(numRows<1){
            return list_All;
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list_All.add(list1);
        for(int i=2;i<=numRows;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> list_pre = list_All.get(i-2);
            for(int j=1;j<i-1;j++) {
                list.add(list_pre.get(j-1)+list_pre.get(j));
            }
            list.add(1);
            list_All.add(list);
        }
        return list_All;
    }

    public static void main(String[] args) {
        List<List<Integer>> T = generate(5);
        System.out.println(T);
    }
}
