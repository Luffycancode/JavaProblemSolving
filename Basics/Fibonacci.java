import java.util.*;
public class fibonacci
{
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

int input=scan.nextInt();
int a=0;
int b=1;
int total=0;
for(int i=0;i<=input;i++)
{
System.out.println(a);
total=a+b;
a=b;
b=total;
}

    }
}