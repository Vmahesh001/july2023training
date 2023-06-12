class Student
{
int rollno;
String name;
static String college="ITS";
Student(int r,String n){
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class Java
{
public static void main(String args[])
{
Student.change();
Student s1=new Student(111,"mahesh");
Student s2=new Student(222,"karan");
Student.college="MITS";
s1.display();
s2.display();
}
}


