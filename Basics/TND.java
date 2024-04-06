import java.util.*;
public class TND
{
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);


int num=scan.nextInt();
int temp=num;
int  count=0;
while(temp!=0)
{
temp=temp/10;
count++;
}

System.out.println(count);






    }
}