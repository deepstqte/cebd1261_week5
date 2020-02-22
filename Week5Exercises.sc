object Week5Exercises {
  
  // ________________________EXERCISE1________________________
  
  def fact(n: Int): Double = n match {
	  case 0 => 1
	  case _ => n * fact(n-1)
	}                                         //> fact: (n: Int)Double
	
	def transformInt(x: Int, f: Int => Double) : Double = {
  	f(x)
  }                                               //> transformInt: (x: Int, f: Int => Double)Double
	
	println(transformInt(5, fact))            //> 120.0
	println(transformInt(2, fact))            //> 2.0
	println(transformInt(3, fact))            //> 6.0
	println(transformInt(9, fact))            //> 362880.0
	println(transformInt(11, fact))           //> 3.99168E7
  
  // ________________________EXERCISE2________________________
  
  val Listt = List("Alice", "John", "Dina", "Valentin")
                                                  //> Listt  : List[String] = List(Alice, John, Dina, Valentin)
  println(Listt(1))                               //> John
  println(Listt.head)                             //> Alice
  println(Listt.tail)                             //> List(John, Dina, Valentin)
  for (name <- Listt) {println(name)}             //> Alice
                                                  //| John
                                                  //| Dina
                                                  //| Valentin
	
	val my_list = List(1, 2, 3, 4, 5)         //> my_list  : List[Int] = List(1, 2, 3, 4, 5)
	
	def product(l: List[Int]): Int = {
		var result = 1
	  for (x <- 0 to l.length - 1) {
	 		result = result * l(x)
	 	}
	  return result
	}                                         //> product: (l: List[Int])Int
	
	println(product(my_list))                 //> 120
	
	println(my_list.reduce((x, y) => x * y))  //> 120
	
	def numberToList(x: Int): List[Int] = {
	  var n = x
		var result_list = List[Int]()
		while (n != 0) {
			result_list = n :: result_list
			n = n - 1
		}
		return result_list
	}                                         //> numberToList: (x: Int)List[Int]
	
	println(numberToList(6))                  //> List(1, 2, 3, 4, 5, 6)
	
	def factorial(x: Int): Double = return numberToList(x).reduce((x, y) => x * y)
                                                  //> factorial: (x: Int)Double
	
	println(factorial(6))                     //> 720.0

	// ________________________EXERCISE3________________________
	
	val list_45 = numberToList(45)            //> list_45  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
                                                  //| 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33,
                                                  //|  34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45)
                                                  
  val list_45_divisible_by_4 = list_45.filter(_ % 4 == 0)
                                                  //> list_45_divisible_by_4  : List[Int] = List(4, 8, 12, 16, 20, 24, 28, 32, 36
                                                  //| , 40, 44)
	
	println(list_45_divisible_by_4.reduce((x, y) => x + y))
                                                  //> 264
	
	val list_45_divisible_by_3_less_than_20 = list_45.filter(_ % 3 == 0).filter(_ < 20)
                                                  //> list_45_divisible_by_3_less_than_20  : List[Int] = List(3, 6, 9, 12, 15, 18
                                                  //| )
	list_45_divisible_by_3_less_than_20.map(x => x*x).reduce((x, y) => x + y)
                                                  //> res0: Int = 819
}