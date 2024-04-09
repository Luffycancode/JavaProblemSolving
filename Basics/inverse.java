import java.util.*;
public class inverse {

public static void main(String[] args) {
    


Scanner scan=new Scanner(System.in);
int num=scan.nextInt();

int cnt=0;
int temp=num;

// First counting digits of number

while(temp!=0)
{
temp=temp/10;
cnt++;
}
// System.out.println(cnt);


// next part

int sum=0;
int div=(int)Math.pow(10, cnt-1);
while(cnt!=0)
{
int getnum=num/div;
num=num%div;
// System.out.println(num);
div=div/10;
int newnum=(int)Math.pow(10, getnum-1);

sum += cnt*newnum;

cnt--;

}

System.out.println(sum);














}
}