import java.lang.*;
class StrBuilder
{
public static void main(String args[])
{
StringBuilder s1=new StringBuilder("hello");
StringBuilder s2=new StringBuilder("world");
StringBuilder s=s1.append(s2);
System.out.println(s.toString());
}
}