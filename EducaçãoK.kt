import kotlin.math. *
fun main(){

 println("Calculadora de Segunbdo Grau")
 println("ax²+bx+c=0")

 
 println ("Digite o primeiro valor A: ")
  var num1=readLine()!!
  var numA = num1.toDouble()

 println ("Digite o primeiro valor B: ")
  var num2=readLine()!!
  var numB = num2.toDouble()

 println ("Digite o primeiro valor C: ")
  var num3=readLine()!!
  var numC = num3.toDouble()


 var delta = numB * numB -4*numA*numC 


  println ("O valor de delta é: " + delta)

  println ("Agora tera o valor das Raizes UM e DOIS" )

  var rz1 = ( (- numB) + (sqrt(delta)))/(2*numA)
           
  var rz2 = ( (- numB) - (sqrt(delta)))/(2*numA )
  

  println ("O valor de Raiz 1 é: " + rz1)

  println ("O valor de Raiz 2 é: " + rz2)
}