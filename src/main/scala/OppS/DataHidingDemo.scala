package OppS

/**
 * Hiding of data is called Datahiding.
 *
 **/

class SBIAcoount{
  private val balance:Double=20000;
}
class HDFCBank
{
  def method1(): Unit =
  {
    val obj=new SBIAcoount()
   // println(obj.balance)
  }
}
object DataHidingDemo {
  def main(args: Array[String]): Unit = {
    val obj2=new HDFCBank()
    obj2.method1()
  }
}
