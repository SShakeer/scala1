package OppS

/**
 * Created by Basha on Jun, 2020
 **/

class G
{
  var land:String="20 ACRES"
}
class P1 extends G {
  var gold: String = "2 KGs"
}
class C11 extends P1
{
  def job()
  {
    println ("Hadoop Developer")
    println (s"Son got "+land+ " from his grand father")
    println (s"Son got "+gold+ " gold from his father")
  }
}
object MultipleInheritance {
  def main(args: Array[String]): Unit = {
    val x = new C11()//
    x.job()
  }
}