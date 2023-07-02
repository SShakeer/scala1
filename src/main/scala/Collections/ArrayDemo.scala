package Collections

/**
 * Created by shakeer on Nov, 2019
 **/
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    //Method1
    val arr=Array(1,2,4,5,7)
    //Method2
    val arr2:Array[Int]=new Array[Int](4)
    arr2(0)=10
    arr2(1)=20
    arr2(2)=10
    arr2(3)=20
    for(i <- arr2){println(i)}
  //print(arr)
  }
}
