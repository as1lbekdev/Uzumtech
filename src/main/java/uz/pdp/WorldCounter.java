package uz.pdp;

import java.util.Scanner;

public class WorldCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        String str;






        System.out.println("Enter a string");
        str = input.nextLine();

        System.out.println("Enter a number");
        n = input.nextInt();

        String[] strs = str.split(" ");
        for(int i=0;i<strs.length;i++)
        {
            int count=0;
            for (int j=0;j<strs.length;j++){
                if(strs[i].equals(strs[j])){
                    count++;
                }
            }
            if(count==n)
                {
                System.out.println(strs[i]);
                strs[i]="";
                }

        }
        input.close();

    }
}
