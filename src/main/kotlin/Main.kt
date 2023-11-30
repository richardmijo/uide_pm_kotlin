import java.lang.NumberFormatException

fun main() {
    println("Hello World!")

    /**
     * String
     * Int
     * Double
     * Float
     * Boolean
     */

    // boolean
    var correcto:Boolean=false

    /**
     * 1 variable
      */
    // 1.1 mutables
    var miVariable: String = "Hola"
    // println(miVariable)

    // 1.2 solo lectura
    val soloLectura = 5.2

    // cambiar valor

    // PI
    // JETPACK usa constantes


    /**
     * 2 valores nulos null safety / valores opcionales - ?=null
      */
    var x = null
    // x= "hola"


    // paso de datos entre pantallas a - b ejemplo null

//    id?.let {
//        // funciones
//    }

    /**
     * 3 cambio de tipo de datos - concatenacion
      */
    val num1 = 4
    val num2 = "5"
    val res = num1+num2.toInt()
    // println(res)

    val t1= "Hola"
    val t2= "mundo"
    // println(t1+t2)

    // plus


    // arreglos .joinToString(" ")
    val array = arrayOf("Hola","mundo")

    /**
     * 4 consola
      */
    println("Escribe tu nombre:")
    //val nombre = readln()
    // println("Hola $nombre")

    // operacion de suma


    /**
     *5 try catch - int double
     */


    /**
     * 6 bucle while - break
     */


    /**
     * 7 arreglos
     * arrayOf
     * intArrayOf
     */


    /**
     * for (i in 1..2)
     *  for (i in 'a'..'f')
     *   for (i in 'f'.downTo('a'))
     */


    /**
     * condicional if
     */


    /**
     * funciones
     * suma
     * lamda {x:Int, y:Int->x+y}
     */



    /**
     * clases
     */


}


class Persona{
    var nombre =""
    var edad=0
    constructor(nombre:String, edad:Int){
        this.nombre= nombre
        this.edad = edad
    }
    fun decirHola(): String {
        return "Hola"
    }
}


class Usuario (private  var name:String, private var email:String){

}