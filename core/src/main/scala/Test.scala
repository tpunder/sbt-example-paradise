object Test extends App {
  println("Compile Time Annotations for ignoredField3: "+helloMacro.compileTimeAnnotations[JavaBean])
  
  import reflect.runtime.universe._
  
  println("Runtime Annotations for ignoredField3: "+typeOf[JavaBean].declaration(newTermName("ignoredField3")).annotations)
}
