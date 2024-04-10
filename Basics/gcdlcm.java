import java.util.*;
public class gcdlcm {
public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b =scan.nextInt();

int temp=a;
int temp2=b;

//GCD FIrst

while(a%b!=0)
{
int rem=a%b;
a=b;
b=rem;
}
System.out.println(b);


//LCM is easy now when we get the GCD

int LCM=(temp*temp2)/b;
System.out.println(LCM);



}}