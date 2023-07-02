package OppS

/**
 * Created by Basha on Jun, 2020
 **/
class P3
{
   def method1()
  {
    println("parent class")
  }
}
class C3 extends P3
{
  def method2()
  {
    println("child class")
  }
}
object InheritanceDemo {
  def main(args: Array[String]): Unit = {
    val ins=new C3();
    ins.method2()
    ins.method1()
  }
}
