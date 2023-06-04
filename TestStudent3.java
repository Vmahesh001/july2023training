class Student
{
int id;
String name;
}
class TestStudent3{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.id=123;
s1.name="mahesh";
s2.id=156;
s2.name="sathish";
//System.out.println("id="+s1.id);
//System.out.println("name="+s1.name);
System.out.println(s1.id+""+s1.name);
//System.out.println("id="+s2.id);
//System.out.println("name="+s2.name);
System.out.println(s2.id+""+s2.name);
}
}