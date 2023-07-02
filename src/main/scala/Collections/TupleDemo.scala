package Collections

/**
 * Created by shakeer on Feb, 2020
 **/
object TupleDemo {
  def main(args: Array[String]): Unit = {
    val t1=(10,"ABC",20.0)
    val t2=new Tuple1(20,"Tuple",30.0)
    println(t1)
    println(t2)
   //0,1,2,
    println(t1._2)
  }
}
