package Patterns;

import java.util.*;

public class pattern6 {

    public static void main(String[] args) {


// * * * *   * * * *
// * * *       * * *
// * *           * *
// *               *
// * *           * *
// * * *       * * *
// * * * *   * * * *

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int space = 1;
        int star = n/2+1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");
            }
            for (int m = 1; m <= star; m++) {
                System.out.print("* ");
            }
            System.out.println();

 if(i>n/2)
 {
star++;
space-=2;
 }
 else
 {
star--;
space+=2;
 }
           
}

    }
}
