object StringReverser{
  def reverseString(str:String):String={
    if (str.isEmpty)""
    else reverseString(str.tail)+str.head
  }

  def main(args: Array[String]):Unit={
    val inputString="hello"
    val reversedString=reverseString(inputString)
    println(s"The reversed string of '$inputString' is '$reversedString'")
  }
}