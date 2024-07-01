object StringFilter{
    def filterLongStrings(strings:List[String]):List[String]={
    strings.filter(_.length>5)
}

    def main(args:Array[String]):Unit={
        val inputStrings=List("hello","are","phython","is","programming")
        val longStrings=filterLongStrings(inputStrings)
        println(s"The strings with length greater than 5 are:$longStrings")


    }
}