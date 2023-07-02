package Collections

/**
 * Created by shakeer on Nov, 2019
 **/
object ListDemo extends App{

  val lst=List(10,20,30,40)
  val lst2=1::2::3::4::Nil
  val names = List("Hadoop","Spark","Scala")
 // var i=0;
 // lst.foreach(i+= _)
  println(names)
  println(lst.head)
  println(lst.tail)
  println(lst.take(2))
  println(lst.reverse)
  println(lst.isEmpty)
}
