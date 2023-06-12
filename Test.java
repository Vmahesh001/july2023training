class Animal
{
public void move()
{
System.out.println("anything");
}
}class Dog extends Animal
{
public void move()
{
System.out.println("dog");
}
}
class Test
{
public static void main(String args[])
{
Animal a1=new Animal();
Animal a2=new Dog();
a1.move();
a2.move();
}
}