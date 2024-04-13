package Patterns;

import java.util.*;

public class Pattern21 {

//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
int space=n-1;
int star=1;
      for(int i=1;i<=n;i++)
      {
        int val=i;
        for(int j=1;j<=space;j++)
        {
System.out.print("  ");
        }
        for(int k=1;k<=star;k++)
        {
          System.out.print(val+ " ");
          if (k <= star / 2) {
              val--;
          } else {
              val++;
          }
        }

        System.out.println();




star+=2;
space--;

      }

    }

}
