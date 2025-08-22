package uz.pdp;

import java.util.Scanner;

public class TwoSums {
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        int []x={1, 2, 5, 6, 7, 8};

        System.out.println("Target:");
        int target=sc.nextInt();
        boolean found=false;


        outerLoop:
        for (int i = 0; i < x.length; i++) {

            for (int j = i + 1; j < x.length; j++) {
                if (x[i] + x[j] == target) {
                    System.out.println(x[i]+"+"+x[j]+"="+target);
                found=true;
                break  outerLoop;
                }
            }
        }
        if(!found){
            System.out.println("Target not foundx");
        }
    }
}
