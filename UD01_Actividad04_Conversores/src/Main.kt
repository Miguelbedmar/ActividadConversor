import java.util.Scanner

//DECLACIÓN DE CONSTANTES
val sc=  Scanner(System.`in`)
// MENSAJES DE ERROR
val mensajeError="ERROR!: El valor no es válido"
val mensajeOpcionError="Error: La opción seleccionada no está disponible"
val mensajeErrorOpcionInvalida="Opción introducida no disponible."
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
                println(mensajeOpcionError)
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

                else -> println(mensajeErrorOpcionInvalida)
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
         println("<===BIENVENIDO AL CONVERSOR DE DIVISAS=====>")
         println("<===========1.DE EUROS A DÓLARES===========>")
         println("<===========2.DE EUROS A LIBRAS ESTERLINAS=>")
         println("<===========3.DE EUROS A YENES=============>")
         println("<===========4.DE EUROS A FRANCOS SUIZOS====>")
         println("<===========5.VOLVER MENU PRINCIPAL========>")
            if(!sc.hasNextInt()) {
                sc.next()
                println(mensajeOpcionError)
                continue
            }
         when(val subOpcionDiv=sc.nextInt()){ // CAMBIO EL NOMBRE DE  OPCIÓN PARA QUE SEA MÁS IDENTIFICATIVO

            1-> print("")
            2-> print("")
            3-> print("")
            4-> print("")
            5-> {
                volverMenuPrincipal=true
            }

             else -> println(mensajeErrorOpcionInvalida)

         }





     }catch (e:Exception){
         print(mensajeError)
     }
  }while (!volverMenuPrincipal)


}

fun subMenuConversorDistancias(){
    var volverMenuPrincipal=false
  do{
      try{
          println("<===BIENVENIDO AL CONVERSOR DE DISTANCIAS===>")
          println("<========== 1.KILÓMETROS A METROS=============>")
          println("<========== 2.METROS A KILOMETROS=============>")
          println("<========== 3.KILÓMETROS A MILLAS=============>")
          println("<========== 4.MILLAS A KILÓMETROS=============>")
          println("<========== 5.CENTÍMETROS A METROS============>")
          println("<========== 6.VOLVER MENU PRINCIPAL===========>")
          if(!sc.hasNextInt()) {
              sc.next()
              println(mensajeOpcionError)
              continue
          }
          when(val subOpcionDis=sc.nextInt()){

              1-> print("")
              2-> print("")
              3-> print("")
              4-> print("")
              5->  print("")

              6->{
                  volverMenuPrincipal=true
              }


              else -> println(mensajeErrorOpcionInvalida)


          }

      }catch (e:Exception){
          print(mensajeError)
      }


  }while (!volverMenuPrincipal)
}

fun subMenuConversorTemperaturas(){
    var volverMenuPrincipal=false
    do{

        print("<===BIENVENIDO AL CONVERSOR DE TEMPERATURA===>\n")
        print("<========== CELSIUS A FAHRENHEIT=============>")
        print("<========== FAHRENHEIT A CELSIUS=============>")
        print("<========== CELSIUS A KELVIN=================>")
        print("<========== KELVIN A CELSIUS=================>")
        print("<========== VOLVER MENU PRINCIPAL============>")



    }while (!volverMenuPrincipal)
}

/** 2. FUNCIÓN CALCULO DE CONVERSORES **/

fun calcularDivisas(){

}
fun calcularDistancias(){

}
fun calcularTemperaturas(){

}