package OppS

/**
 * Created by Basha on Mar, 2020
 **/

class pm{
  def maximum(a:Int,b:Int):Int=
    {
      if(a>b)a else b
    }
}
object parameterizedmethod {
  def main(args: Array[String]): Unit = {
    val p=new pm()
    println(p.maximum(100,200))
    val op=p.maximum(90,200)
    println(op)
  }
}
