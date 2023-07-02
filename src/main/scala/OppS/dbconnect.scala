package OppS

import java.sql.DriverManager
import java.sql.Connection
object dbconnect {

  def main(args: Array[String]) {
    val driver = "oracle.jdbc.driver.OracleDriver"
    val url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL"
    val username = "scott"
    val password = "tiger"
    var connection:Connection = null
    try {
      // connection
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT ename, sal FROM emp")
      while ( resultSet.next() ) {
        val ename = resultSet.getString("ename")
        val salary = resultSet.getString("sal")
        println("Employee Name is " + ename + " and his salary is " + salary)
      }
    } catch {
      case e => e.printStackTrace
    }
    connection.close()
  }

}