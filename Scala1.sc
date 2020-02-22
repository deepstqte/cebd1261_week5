object LearningScala1 {
  
  // EXERCISE
  // 1- Write some code that takes the value of pi, doubles it, and then prints it within a string with
  // three decimal places of precision to the right.
  
  val pi_number : Double = 3.14159265             //> pi_number  : Double = 3.14159265
  println(f"Pi is about $pi_number%.3f")          //> Pi is about 3.142
  
  //2- Write some code inside println(boolean expressions) to return true and false (println(a < 6 && 3 == 3))
  
  println(pi_number < 6)                          //> true
  println(pi_number > 6)                          //> false
  
  //3- Explore .getclass and write a code to print int, float, boolean.
  
  println(4.getClass)                             //> int
  println(4.45662f.getClass)                      //> float
  println((5 == 5).getClass)                      //> boolean
  
  //4- Explore .toString and print CEBD1261 in a println command
  
  val class_code = 1261                           //> class_code  : Int = 1261
  println("CEBD" + class_code.toString)           //> CEBD1261
  
  // Just write your code below here; any time you save the file it will automatically display the results!
  // Code written above
  
  
}