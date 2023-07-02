package Collections

/**
 * Created by shakeer on Nov, 2019
 **/
object MapDemo2 {
  def main(args: Array[String]): Unit = {
    val lst=List(1,30,40,50,60)
    println(lst.map(_ *2))
    println(lst.map(x=>x*2))
    println(lst.map(x=> "Hi " +x))
  }

}
