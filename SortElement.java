import java.util.Scanner;
import java.util.Arrays;
class SortElement
{
public static void main(String args[])
{
int n,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter no of elements you want in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for ( i = 0; i < a.length; i++)   
{  
for (int j = i + 1; j < a.length; j++)   
{  
int tmp = 0;  
if (a[i] < a[j])   
{  
tmp = a[i];  
a[i] = a[j];  
a[j] = tmp;  
}  
} 
}
for(int x:a)   
System.out.print((x)+" "); 
} 
}



