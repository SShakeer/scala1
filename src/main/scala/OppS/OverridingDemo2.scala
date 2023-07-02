package OppS
/**
 * Created by Basha on Jun, 2020
 **/
class city
{
  def Ebillcalculation(units: Int)
  {
    println ("Urban Bill amount: "+units*5.00);
  }
}
class rural extends city
{
  override def Ebillcalculation(units: Int)
  {
    println("Towns and Villages Bill amount: "+units*2.00);
  }
}

object OverridingDemo2 {
  def main(args: Array[String]): Unit = {
  val obj = new city();
  obj.Ebillcalculation(100)
  val d=new rural();
  d.Ebillcalculation(100)
}
}
