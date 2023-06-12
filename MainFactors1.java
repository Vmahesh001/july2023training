import java.util.Scanner;
public class MainFactors1
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int number =sc.nextInt();
int count=0;
for (int i = 1; i <= number; i++)
{
if (number % i == 0) 
{
count++;
System.out.print(i);
if (i!=number)
{
System.out.print(",");
}
}
}
System.out.print("\n count of factors of "+number+"is :"+count);
}
}


   
 
