object LearningScala3 {
  // Functions
  
  def transformStr(x: String, f: String => String) : String = {
  	f(x)
  }                                               //> transformStr: (x: String, f: String => String)String

  
  // EXERCISE
  // 1- Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
  // Write a function that converts a string to upper-case, and use that function of a few test strings.
  // Then, do the same thing using a function literal (transformStr) instead of a separate, named function.
  
  def up(x:String): String = {x.toUpperCase}      //> up: (x: String)String
  println(up("Hello!"))                           //> HELLO!
  println(up("FrIend"))                           //> FRIEND
  println(up("Hello Friend!"))                    //> HELLO FRIEND!
  
  transformStr("Hello!", x => x.toUpperCase)      //> res0: String = HELLO!
  transformStr("FrIend", x => x.toUpperCase)      //> res1: String = FRIEND
  transformStr("Hello Friend!", x => x.toUpperCase)
                                                  //> res2: String = HELLO FRIEND!
  
  // 2- Write a function to input a string chosen from {one, two, three, four}. Then define a function to square the number and
  // print the combined string as result like three => the cube is 27.
  
  def wordToInt(x:String): Int = {
    x match {
	  	case "one" => return 1
	  	case "two" => return 2
	  	case "three" => return 3
	  	case "four" => return 4
	  	case _ => throw new IllegalArgumentException("Not a supported Number");
	 	}
  }                                               //> wordToInt: (x: String)Int
  
  def cubeString(x: String, f: String => Int) : Int = {
  	f(x)
  }                                               //> cubeString: (x: String, f: String => Int)Int
  
  cubeString("two", x => wordToInt(x) * wordToInt(x) * wordToInt(x))
                                                  //> res3: Int = 8
  
  // 3- Write a max function that picks the max of two numbers and another callmax function to call the first one with inputs
}