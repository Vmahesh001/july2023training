import java.lang.*;
import java.util.Scanner;
class Frequency{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch=sc.next().charAt(0);
int j=0;
for(int i=0;i<=str.length()-1;i++)
{
if (str.charAt(i)==ch)
{
j++;
}
}
System.out.println(j);
}
} 