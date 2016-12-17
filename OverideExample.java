class Bank
{
 int rateofinterest()
{
return 0;
}
}
class SBI extends Bank
{
static int rateofinterest()
{
return 8;
}
}
class BOI extends Bank
{
int rateofinterest()
{
return 13;
}
}
class HDFC extends Bank
{
int rateofinterest()
{
return 7;
}
}
public class OverideExample
{
public static void main(String []args)
{
SBI s=new SBI();
BOI b=new BOI();
HDFC h=new HDFC();

System.out.println("SBI rate interest is :"+s.rateofinterest());
System.out.println("BOI rate interest is :"+b.rateofinterest());
System.out.println("HDFC rate interest is :"+h.rateofinterest());
}
}

