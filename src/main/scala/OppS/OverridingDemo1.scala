package OppS
/**
 * Created by Basha on Jun, 2020
 **/

class P4
{
  def method12(): Unit =
  {
   println("This is Parent Method")
  }
}
class C4 extends P4
{
 override def method12(): Unit =
  {
    println("This is Child Method")
  }
}
object OverridingDemo1 {
  def main(args: Array[String]): Unit = {
   val obj=new C4();
    obj.method12()
  }
}
