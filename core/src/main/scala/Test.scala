object Test extends App {
  println("Compile: "+helloMacro.compileTimeAnnotations[JavaBean])
  
  import reflect.runtime.universe._

  println("Runtime: "+typeOf[JavaBean].declaration(newTermName("ignoredField3")).annotations)
}
