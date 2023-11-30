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
    println(miVariable)
    miVariable = "Hola 1"
    println(miVariable)

    // 1.2 solo lectura
    val soloLectura = 5.2

    // cambiar valor

    // PI
    // JETPACK usa constantes


    /**
     * 2 valores nulos null safety / valores opcionales - ?=null
      */
    // var x = ?null
    // x= "hola"

    var id:Long?=null

    // paso de datos entre pantallas a - b ejemplo null
    id = 20
    id?.let {
        // en el caso de no ser nulo, se puede llamar a funciones, servicios web u otras operaciones
    }

    /**
     * 3 cambio de tipo de datos - concatenacion
      */
    val num1 = 4
    val num2 = "5"
    val respuesta = num1 + num2.toInt()
    // val res = num1+num2.toInt()
    println(respuesta)

    val t1= "Hola"
    val t2= "mundo"
    println(t1+t2)

    println(t1.plus(" ").plus(t2))

    // plus

    // arreglos .joinToString(" ")
    val nombreVaraible = arrayOf("Hola","mundo")

    /**
     * 4 consola
      */
    println("Escribe tu nombre:")
    //val nombre = readln()
    //println("Hola "+nombre)

    // operacion de suma
    /*println("Ingresa valor 1")
    val s1 = readln();

    println("Ingresa valor 2")
    val s2 = readln();

    println(s1.toInt()+s2.toInt())*/
    /**
     *5 try catch - int double
     */



    /**
     * 6 bucle while - break
     */
    var control = "Si"
    while(control == "No"){
        try {
            println("Ingresa valor 1")
            val s1 = readln();

            println("Ingresa valor 2")
            val s2 = readln();

            println(s1.toInt()+s2.toInt())
        }catch (e:NumberFormatException){
            println("ERROR $e")
        }
        println("Desea continuar?")
        control = readln();
    }

    /**
     * 7 arreglos
     * arrayOf
     * intArrayOf
     */
    val array = arrayOf("Hola","mundo", 22,22.4)
    val enteros= intArrayOf(1,2,3,4)

    /**
     * for (i in 1..2)
     *  for (i in 'a'..'f')
     *   for (i in 'f'.downTo('a'))
     */

    for(i in 'z'.downTo('a')){
        // println(i)
    }

    /**
     * condicional if
     */
    if(true){

    }

    /**
     * funciones
     * suma
     * lamda {x:Int, y:Int->x+y}
     */
    suma(2,3)
    suma(3,9)

    // uso de lambas
    val fun1 = {x:Int,y:Int->x+y}
    val resutaldo = fun1(1,2)

    /**
     * clases
     */


}

fun suma(s1:Int,s2:Int){
    println(s1+s2)
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


class Usuario (private  var name:String, private var email:String)