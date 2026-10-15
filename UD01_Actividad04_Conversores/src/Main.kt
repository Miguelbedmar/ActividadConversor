import java.util.Scanner
val sc=  Scanner(System.`in`)
val mensajeError="ERROR!: El valor no es válido"
fun main() {
menuPrincipal()

}

//Función que contiene el menu principal del programa
fun menuPrincipal(){
 var salir= false
    do{
        try{
            println("<=====CONVERSOR DE UNIDADES========>")
            println("<=======1.CONVERSOR DE DIVISAS===========>")
            println("<=======2.CONVERSOR DE DISTANCIAS=========>")
            println("<=======3.CONVERSOR DE TEMPERATURAS====>")
            println("<=======4.SALIR========>")
            println("<=======Seleccione una opcion=========>")
            if(!sc.hasNextInt()) {
                sc.next()
                println("Error: La opción seleccionada no está disponible")
                continue
            }

            when(val opcion=sc.nextInt()){
                1->

                2->

                3->

                4->{
                    salir=true
                    println("Has salido del programa")
                }

                else -> println("Opción introducida no disponible.")
            }
        }catch (e:Exception){
            println(mensajeError)
        }
    }while (!salir)

}
//Función para pedirle datos al usuario+
fun pedirDatos(num1: Double){
   var salir=false
    while (salir){
           println("Ingrese un numero")
           num1 = sc.hasNextDouble()

    }
}



