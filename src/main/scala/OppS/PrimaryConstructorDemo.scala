package OppS

/**
 * Created by Basha on Jun, 2020
 **/
class Emp(Empno:Int, Ename:String)
{
  def Display ()
  {
    println("Employee Name is:" +Ename)
    println("Employee id is:" +Empno)
  }
}

object PrimaryConstructorDemo {
  def main(args: Array[String]): Unit = {
    var e = new Emp(4700,"Basha");
    e.Display()
  }
}
