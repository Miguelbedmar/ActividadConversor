import java.util.Scanner

//DECLACIÓN DE CONSTANTES
val sc=  Scanner(System.`in`)
val dolar=1.08
val libraEsterlina=0.86
val yen=163.0
val francoSuizo=0.95


/**MENSAJES DE ERROR*/
val mensajeError="ERROR!: El valor no es válido"
val mensajeOpcionError="Error: La opción seleccionada no está disponible"
val numeroError="Error: la cantidad no puede ser negativa."
/*** PROGRAMAPRINCIPAL**/
fun main() {
menuPrincipal()

}
/**FUNCIONES **/
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

            when(sc.nextInt()){
                1->subMenuConversorDivisas()

                2->subMenuConversorDistancias()

                3->subMenuConversorTemperaturas()

                4->{
                    salir=true
                    println("Has salido del programa")
                }

                else -> println(mensajeOpcionError)
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
         when(sc.nextInt()){ // CAMBIO EL NOMBRE DE  OPCIÓN PARA QUE SEA MÁS IDENTIFICATIVO

            1->{
                val numeroIngresado= pedirDatos("ingrese la cantidad  en euros")
                    if(numeroIngresado<0){
                       print(numeroError)
                    }else{
                        println("Aqui se calcularia la converción o se llamaría a la funcióm")
                    }

            }
            2-> print("")
            3-> print("")
            4-> print("")
            5-> {
                volverMenuPrincipal=true
            }

             else -> println(mensajeOpcionError)

         }





     }catch (e:Exception){
         println(mensajeError)
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
          when(sc.nextInt()){

              1-> print("")
              2-> print("")
              3-> print("")
              4-> print("")
              5->  print("")

              6->{
                  volverMenuPrincipal=true
              }


              else -> println(mensajeOpcionError)


          }

      }catch (e:Exception){
          println(mensajeError)
      }


  }while (!volverMenuPrincipal)
}

fun subMenuConversorTemperaturas(){
    var volverMenuPrincipal=false
    do{
        try {


            println("<===BIENVENIDO AL CONVERSOR DE TEMPERATURA=====>")
            println("<========== 1.CELSIUS A FAHRENHEIT=============>")
            println("<========== 2.FAHRENHEIT A CELSIUS=============>")
            println("<========== 3.CELSIUS A KELVIN=================>")
            println("<========== 4.KELVIN A CELSIUS=================>")
            println("<========== 5.VOLVER MENU PRINCIPAL============>")
            if(!sc.hasNextInt()) {
                sc.next()
                println(mensajeOpcionError)
                continue
            }
            when(sc.nextInt()){

                1-> print("")
                2-> print("")
                3-> print("")
                4-> print("")
                5-> {
                    volverMenuPrincipal=true
                }
                else -> println(mensajeOpcionError)


            }
        }catch (e:Exception){
            println(mensajeError)
        }

    }while (!volverMenuPrincipal)
}


/** 2. FUNCIÓN CALCULO DE CONVERSORES **/

fun calcularDivisas(){

}
fun calcularDistancias(){

}
fun calcularTemperaturas(){

}