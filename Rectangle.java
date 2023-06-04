class Rectangle
{
int length,width;
void insert(int i,int w)
{
length=i;
width=w;
}
void display()
{
System.out.println(length*width);
}

}
class TestRectangle
{
public static void main(String args[])
{
Rectangle s1=new Rectangle();
Rectangle s2=new Rectangle();
s1.insert(11,5);
s2.insert(3,15);
s1.display();
s2.display();
}
}