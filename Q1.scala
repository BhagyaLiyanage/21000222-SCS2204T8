package LabSheet_04

object Q1 {
  def main(args: Array[String]): Unit = {
    val interest = interestAmount(100)
    println(s"The interest: $interest")
  }

  val interestAmount: Double => Double = {
    case x if x < 0 => 0
    case x if x < 20000 => x * 0.02
    case x if x < 200000 => x * 0.04
    case x if x < 2000000 => x * 0.035
    case x if x >= 20000000 => x * 0.065
  }
}
