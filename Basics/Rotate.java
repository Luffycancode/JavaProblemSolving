import java.util.*;

public class Rotate {
public static void main(String[] args) {

Scanner scan=new Scanner(System.in);

int num=scan.nextInt();
int rotate= scan.nextInt();
int temp=num;
int cnt=0;
while(temp!=0)
{
temp=temp/10;
cnt++;
}
rotate = rotate % cnt;
if(rotate<0)
{
    rotate=cnt+rotate;
}


// int div=(int)Math.pow(10, rotate);
// int temp2=num;
// int div1=temp2%div;
// int div2=temp2/div;
// System.out.println(div1);
// System.out.println(div2);

// int random=cnt-rotate;

// int add=(int)Math.pow(10, random);
// int add2= div1*add;
// add2=add2+div2;

// System.out.println(add2);

//More optimize

int mul=1;
int div=1;
while(cnt!=0)
{
    if(cnt<=rotate)
    {
        div=div*10;
    }
    else{
        mul=mul*10;
    }
    cnt--;
}



int num1=num%div;
int num2=num/div;
int total=num1*mul+num2;
System.out.println(total);

}
}
