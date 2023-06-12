class Carro {
  var marca  = "ford"
  var modelo = "mustang"
  var ano = 1969
}
  //outra manenina de construir CLASSE

  
 
class Carros(var marca: String, var modelo: String, var ano: Int)

fun main(){




  //Crie um objeto c1 da classe Carro
  
val ford = Carro()

//adicione alguns valores a ela


ford.marca = "Ford"
ford.modelo = "Mustang"
ford.ano = 1969

  



var fd = Carros("Ford", "Fusca", 1989)

  
// imprimir atributos do VAL FORD
   
println(ford.marca)   // Saídas Ford
println(ford.modelo)   // Saídas Mustang
println(ford.ano)    // Saídas 1969 

println(fd.marca)
println(fd.modelo)
println(fd.ano)
}