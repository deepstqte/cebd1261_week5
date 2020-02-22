object LearningScala2 {
	 
	 // EXERCISE
	 // 1- Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 
	 var count = 1                            //> count  : Int = 1
	 var n1 = 0                               //> n1  : Int = 0
	 var n2 = 1                               //> n2  : Int = 1
   while (count <= 8) {
     var res = n1 + n2
     if (n1 == 0) println(n1)
     if (n2 == 0) println(n2)
     println(res)
     n1 = n2
     n2 = res
  	 count += 1
   }                                              //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
	 
	 // 2- Write a function that takes the number and says here is the cube of the input: 5 -> 125 is the cube
	 
	 def cube(x:Int): Int = {
	   return x*x*x
	 }                                        //> cube: (x: Int)Int
	 
	 println(cube(6))                         //> 216
	 
	 // 3- Use the while loop and print cube of x values up to 10. Use a block in println.
}