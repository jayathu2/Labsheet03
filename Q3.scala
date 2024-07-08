object ArithmeticMeanCalculator{
  def meanRounded(num1: Int, num2: Int): Double = {
    val mean = (num1+num2)/2.0
    BigDecimal(mean).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
  }
  // hgfhgfjgfy
  // tfthftufutfuygfyu

  def main(args: Array[String]):Unit={
    val num1=5
    val num2=10
    val result=meanRounded(num1,num2)
    println(s"The arithmetic mean of $num1 and $num2, rounded to two decimal places, is $result")
}
}