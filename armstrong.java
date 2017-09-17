import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
int n,n1,m,sum=0;
System.out.println("armstrong number");
Scanner in=new Scanner(System.in);
System.out.println("enter the number");
n=in.nextInt();
n1=n;
do
{
m=n1%10;
sum=sum+(m*m*m);
n1=n1/10;
}
while(n1!=0);
if(n==sum)
{
System.out.println("given number is armstrong number");
}
else
{
System.out.println("it's not a armstrong number");
}
}
}