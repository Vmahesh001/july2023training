import java.util.Scanner;
class Table3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
String str="";
for (int i=0;i<=m;i=i+n)

{System.out.println("old value of str:"+str+"value of i:"+i);
str=str+i+",";
System.out.println("updated value of str :"+str);
}
for(int i=0;i<str.length()-1;i++)
System.out.print(str.charAt(i));
}
}
