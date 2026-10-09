import java.util.Scanner
val sc=  Scanner(System.`in`)

fun main() {
menuPrincipal()

}


fun menuPrincipal(){
 var salir= false
    do{
        try{
            println("<=====CONVERSOR DE UNIDADES========>")
            println("<=======1.CONVERSOR DE DIVISAS===========>")
            println("<=======2.CONVERSOR DE DISTANCIAS=========>")
            println("<=======3.CONVERSOR DE TEMPERATURAS====>")
            println("<=======4.SALIR========>")
            if(!sc.hasNextInt()) {
                sc.next()
                println("Error: La opción seleccionada no está disponible")
                continue
            }

         when(val opcion=sc.nextInt()){

             in 1..3-> {

         }
             4->{
                 salir=true
                println("Has salido del programa")
             }

             else -> println("Opción introducida no disponible.")
         }
        }catch (e:Exception){
            println("Se ha producido un error")
        }
  }while (!salir)

}

fun pedidaDatos(num1: Double){
var num1=0.0
    println("Ingrese")
}