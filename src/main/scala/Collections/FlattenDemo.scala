package Collections

/**
 * Created by shakeer on Nov, 2019
 **/
object FlattenDemo {
  val lst=List(List(1,2,3),List(4,5,6))
  def main(args: Array[String]): Unit = {

    println(lst.flatten)
   //     val lst2=lst.flatMap(y => List(y, y+1)))

  }
}
