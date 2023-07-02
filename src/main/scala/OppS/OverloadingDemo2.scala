package OppS

/**
 * Created by Basha on Jun, 2020
 **/
// Difference in the datatype of parameters

class Addition02
{
  def add01(x: Int, y: Int)
  {
    println(x+y);
  }
  def add01(x: Double, y: Double)
  {
    println(x+y);
  }
}
object OverloadingDemo2 {
  def main(args: Array[String]): Unit = {
    val obj=new Addition02()
    obj.add01(100.5,110.5);
    obj.add01(200,200);
  }
}
