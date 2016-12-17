class Sample1
{
void run()
{
System.out.println("vehicle is on the way");
}
}
class Sample extends Sample1
{
void run()
{
System.out.println("vehicle is reached");
}
}
 public class Overriding
{
public static void main(String []args)
{
Sample s1 =new Sample();
s1.run();
}
}
