package LabSheet_04

object Q3 {
  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    val n1 = formatNames(names(0), str => str.toUpperCase)
    val n2 = formatNames(names(1).substring(0, 2), str => str.substring(0, 2).toUpperCase + str.substring(2))
    val n3 = formatNames(names(2), str => str.toLowerCase)
    val n4 = names(3).substring(0, 5) + formatNames(names(3).substring(5), str => str.toUpperCase)

    println(n1)
    println(n2)
    println(n3)
    println(n4)
  }

  def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
  }
}
