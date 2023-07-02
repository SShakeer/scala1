package OppS
/**
 * Created by Basha on Jun, 2020
 **/
//Primary Constructor
class Employee1(val eid:Int, val ename:String, val email:String) {
  //Secondary or Auxilury or optional
  def this(eid:Int, ename:String)
  {
    this(eid,ename , "") // Invoke the primary constructor
  }
  def this(eid:Int)
  {
    this(eid,"NA" , "NA") // Invoke the primary constructor
  }
}
object AuxiluryConstructor {
  def main(args: Array[String]): Unit = {
    val em1 = new Employee1(1000,"Basha","basha@gmail.com")
    println(em1.eid + "\t"+ em1.ename + "\t" + em1.email)
    val em2 = new Employee1(1001,"Hadoop")
    println(em2.eid + "\t"+ em2.ename + "\t" + em2.email)
    val em3 = new Employee1(1002)
    println(em3.eid + "\t"+ em3.ename + "\t" + em3.email)
  }
}
