package Collections

/**
 * Created by shakeer on Nov, 2019
 **/
object ListAdd {
  def main(args: Array[String]): Unit = {
  var lst=List.empty[String]
    lst:+="Hadoop"
    lst:+="Spark"
    lst:+= "Java"
    println(lst)

    //m2
    var lst2=List.empty[String]
    lst2 ++= List("Hadoop","Spark","Java")
    println(lst2)
  }

}
