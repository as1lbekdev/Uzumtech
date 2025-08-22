package uz.pdp;

import java.util.ArrayList;
import java.util.List;

public class TwoPointers {
    public static void main(String[] args) {

        int[] x = {1,1,1,2,2,3,3,3,3};
        int count=0;
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < x.length; i++) {
            if (!y.contains(x[i])) {
                y.add(x[i]);
                count++;
            }
        }
        int []z=new int[count];
        for (int i = 0; i < y.size(); i++) {
            z[i]=y.get(i);
            System.out.print(" "+z[i]);
        }



    }
}
