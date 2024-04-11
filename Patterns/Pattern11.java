package Patterns;

import java.util.*;

public class Pattern11 {


// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11  12  13  14  15

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        // int star = n/2+1;


int num=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
    System.out.print(num+"  ");
    num++;
}
System.out.println();
}







    }}