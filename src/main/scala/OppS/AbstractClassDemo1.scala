package OppS

/**
 * Created by shakeer on Jun, 2020
 **/
//abstract methods should be implemented in sub class of abstract class
abstract class Demo11
{
  def method15()
  {
    println("m15 method")
  }
  def method16()
}
class Demo20 extends Demo11
{
  def method16()
  {
    println("m16 method")
  }
}

object AbstractClassDemo1 {
  def main(args: Array[String]): Unit = {
    val obj=new Demo20;
    obj.method16()
    obj.method15()
  }
}
