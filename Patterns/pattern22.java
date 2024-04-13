package Patterns;

import java.util.*;

public class pattern22 {

    // 1
    // 2 1 2
    // 3 2 1 2 3
    // 4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int space = n - 1;
        // int star = 1;
        int space=0;
        int star=n;
        int star2=n;
        int last=n*n+n;
        int val = 1;
        for (int i = 1; i <=n; i++) {

for(int j=1;j<=space;j++)
{
    System.out.print("  ");
}
for(int k=1;k<=star;k++)
{
    System.out.print(val+ " ");
    val++;
}
int temp=last-val+1;
for(int m=1;m<=star2;m++)
{
    temp++;
System.out.print(temp+ " ");

}
System.out.println();

space++;
star--;
star2--;;
        }

    }

}
