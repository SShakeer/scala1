package OppS

/**
 * Created by Basha on Jun, 2020
 **/
//final
class P5
{
  def properties()
  {
    println("Land+money")
  }

  //final
  def vehicle()
  {
    println("Father decided to buy a Hero Splender Bike")
  }
}
class C5 extends P5
{
  def education()
  {
    println("Studying");
  }
  override def vehicle()
  {
    println("Child won’t like father decision about vehicle, planning to puchase Royal Enfield bike");
  }
}
object OverridingDemo3 {
  def main(args: Array[String]): Unit = {
    val c = new C5()
    c.properties()
    c.education()
    c.vehicle()
  }
}
