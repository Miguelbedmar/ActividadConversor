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
                1->subMenuConversorDivisas()

                2->subMenuConversorDistancias()

                3->subMenuConversorTemperaturas()

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
fun pedirDatos(mensaje: String): Double{
   var datoValido=false
    var num1 =0.0
    while (!datoValido){
           println(mensaje)
            if( sc.hasNextDouble()){
                num1=sc.nextDouble()
                datoValido=true
            }else{
                println("Ingrese un valor válido")
                sc.next()
            }
    }
    return num1
}
/**CREAMOS LAS DIFERENTES FUNCIONES QUE CORRESPONDAN A LOS SUBMENUS
 * 1. FUNCIÓN ESQUELETO SUBMENU**/
fun subMenuConversorDivisas(){
    var volverMenuPrincipal=false
  do{
     try {
         print("<===BIENVENIDO AL CONVERSOR DE DIVISAS===>\n")
         print("<===========1.DE EUROS A DÓLARES===========>")
         print("<===========2.DE EUROS A LIBRAS ESTERLINAS=>")
         print("<===========3.DE EUROS A YENES=============>")
         print("<===========4.DE EUROS A FRANCOS SUIZOS====>")
         print("<===========5.VOLVER MENU PRINCIPAL========>")
            if(!sc.hasNextInt()) {
                sc.next()
                println("Error: La opción seleccionada no está disponible")
                continue
            }
         when(val subOpcionDiv=sc.nextInt()){ // CAMBIO EL NOMBRE DE  OPCIÓN PARA QUE SEA MÁS IDENTIFICATIVA





         }





     }catch (e:Exception){
         print(mensajeError)
     }
  }while (!volverMenuPrincipal)


}

fun subMenuConversorDistancias(){
    print("<===BIENVENIDO AL CONVERSOR DE DISTANCIAS===>\n")
    print("<========== KILÓMETROS A METROS=============>")
    print("<========== METROS A KILOMETROS=============>")
    print("<========== KILÓMETROS A MILLAS=============>")
    print("<========== MILLAS A KILÓMETROS=============>")
    print("<========== CENTÍMETROS A METROS============>")
    print("<========== VOLVER MENU PRINCIPAL===========>")


}

fun subMenuConversorTemperaturas(){
    print("<===BIENVENIDO AL CONVERSOR DE TEMPERATURA===>\n")
    print("<========== CELSIUS A FAHRENHEIT=============>")
    print("<========== FAHRENHEIT A CELSIUS=============>")
    print("<========== CELSIUS A KELVIN=================>")
    print("<========== KELVIN A CELSIUS=================>")
    print("<========== VOLVER MENU PRINCIPAL============>")


}

/** 2. FUNCIÓN CALCULO DE CONVERSORES **/

fun calcularDivisas(){

}
fun calcularDistancias(){

}
fun calcularTemperaturas(){

}