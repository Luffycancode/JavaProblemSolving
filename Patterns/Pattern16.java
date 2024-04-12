package Patterns;

import java.util.*;

public class Pattern16 {

// 1                   1
// 1 2               2 1
// 1 2 3           3 2 1
// 1 2 3 4       4 3 2 1
// 1 2 3 4 5   5 4 3 2 1
// 1 2 3 4 5 6 5 4 3 2 1
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
int n=scan.nextInt();
int star=1;
int space=n*2-3;
int star1=1;


for(int i=1;i<=n;i++)
{
int val=1;

for(int j=1;j<=star;j++)
{
    System.out.print(val+ " ");
    // if(j<n*2)
    val++;
}
for(int k=1;k<=space;k++)
{
    System.out.print("  ");
}
if (i == n) {
    star1--;
    val--;

}
for(int l=1;l<=star1;l++)
{
    val--;
    System.out.print(val+" ");
    
}

star++;
space-=2;
star1++;


System.out.println();





}
    }
}