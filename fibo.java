import java.util.Scanner;
class fibo
{
public static void main(String[] args)
{
int a=0,b=1,c;
int n;
Scanner in=new Scanner(System.in);
System.out.println("enter the nth term");
n=in.nextInt();
System.out.println(a);
System.out.println(b);
for(int i=0;i<n;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
