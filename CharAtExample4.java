// printing all odd numbers index
import java.lang.*;
class CharAtExample4{
public static void main(String args[])
{
String str="welcome to java training";
for(int i=0;i<=str.length()-1;i++)
{
if(i%2==0)
{

System.out.println("char at"+i+"place"+str.charAt(i));
}
}
}
}