import scala.reflect.macros.Context
import scala.language.experimental.macros
import scala.annotation.StaticAnnotation

object helloMacro {

  def compileTimeAnnotations[T]: String = macro compileTimeAnnotationsImpl[T]
  
  def compileTimeAnnotationsImpl[T: c.WeakTypeTag](c: Context): c.Expr[String] = {
    import c.universe._
    val tpe: c.Type = c.weakTypeOf[T]
    val sym: Symbol = tpe.declaration(newTermName("ignoredField3"))
    sym.typeSignature
    val s: String = sym.annotations.toString
    c.Expr[String](Literal(Constant(s)))
  }
}
