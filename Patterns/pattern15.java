package Patterns;

import java.util.*;

public class pattern15 {

//     1
//   2 3 2
// 3 4 5 4 3
//   2 3 2
//     1
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int space=n/2;
        int star=1;
        int num=1;
        // int star = n/2+1;
        for (int i = 1; i <=n; i++) {

           for(int j=1;j<=space;j++)
           {
            System.out.print("  ");
           }
           int val=num;
           for(int k=1;k<=star;k++)
           {

            System.out.print(val+" ");

            if(k<=star/2)
            {
            val++;
            }
            else{
                val--;
            }

           }
           System.out.println();

           if(i<=n/2)
           {
space--;
star+=2;
num++;
           }
           else{
            space++;
            star-=2;
num--;
           }
        }

    }
}