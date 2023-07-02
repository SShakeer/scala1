package OppS

/**
 * Created by shakeer on Jun, 2020
 **/

class Employee2(eid:Int, ename:String, email:String) {

  val employeeid=eid
  val empname=ename
  val emailid=email

  //Secondary or Auxilury or optional
  def this(eid:Int, ename:String)
  {
    this(eid,ename , "") // Invoke the primary constructoru
  }
  def this(eid:Int)
  {
    this(eid,"NA" , "NA") // Invoke the primary constructoru
  }
}
object Auxdemo2 {
  def main(args: Array[String]): Unit = {
    val em4 = new Employee2(1000, "Vinod", "vinod@gmail.com")
    println(em4.employeeid + " ," + em4.empname + " " + em4.emailid)

    val e = new Employee2(1001, "Virat")
    println(e.employeeid + "," + e.empname)

    val f = new Employee2(1002)
    println(f.employeeid)
  }
}
