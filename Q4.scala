object SumEvenNumbers{
    def main(args:Array[String]):Unit={
        val numbers=List(1,2,3,4,5,6)
        println(s"Sum of even numbers:${SumEvenNumbers(numbers)}")


    }

    def SumEvenNumbers(numbers: List[Int]): Int={
        numbers.filter(_%2==0).sum

    }//oooo



}