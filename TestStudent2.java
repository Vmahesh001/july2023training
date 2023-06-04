class Student
{
int id;
String name;
}
class TestStudent2{
public static void main(String args[])
{
Student s=new Student();
s.id=123;
s.name="mahesh";
//System.out.println("id="+s.id);
//System.out.println("name="+s.name);
System.out.println(s.id+""+s.name);

}
}