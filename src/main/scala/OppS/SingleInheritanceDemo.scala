package OppS

/**
 * Created by shakeer on Jun, 2020
 **/
class P
{
  var vehicle:String="HUNDAI I20"
  var house:String ="DUPLEX"
  def Parentproperties()
  {
    println("All properties of parent class")
  }
}
class C extends P
{
  def job()
  {
    println("Child inherits the parents properties")
    println("Name of his father's car is " + vehicle )
    println("Type of his father's House is " + house)
  }
}
object SingleInheritanceDemo {
  def main(args: Array[String]): Unit = {

    val instance = new C()
    instance.Parentproperties()
    instance.job()
  }
}
