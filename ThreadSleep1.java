class First1 implements Runnable
{
Thread t;String S;
First1(String Name)
{
S=Name;
t=new Thread(this,S);
System.out.println("CHILD:"+t);;
t.start();
}
public void run(){
try{
    for(int i=5;i>0;i--)
    {
System.out.println(S+":"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e){}
System.out.println("EXITING"+S);
}
}
class ThreadSleep1{
public static void main(String args[])throws Exception
{
new First1("ONE");
new First1("TWO");
new First1("THREE");

try{
for(int i=5;i>0;i--)
{
System.out.println("MAIN:"+i);
Thread.sleep(20000);
}
}
catch(Exception e){}
System.out.println("EXISTING main");

}
}