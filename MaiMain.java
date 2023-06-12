class MaiMain
{
public static void main(String args[])
{
int[] num={2,-9,0,5,12,-25,22,9,8,12};
System.out.println("using for each loop");
for(int number: numbers)
{
sum+=number;
}
int arraylength=numbers.length;
average=((double)sum/(double)arrayLength);
System.out.println("sum="+sum);
System.out.println("average="+average);
}
}