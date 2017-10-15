import java.util.*;
class agecal
{
public static void main(String args[])
{
Date d1=new Date(1988,6,18);
Date d2=new Date();
String s1,s2;
int age;
age=d2.getYear()-d1.getYear();
s1=d1.toString();
s2=d2.toLocalString();
System.out.println("Birth date="+s1);
System.out.println("Current date="+s2);
System.out.println("Age="+age);
}
}
