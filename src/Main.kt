import java.util.Stack

class Stack<T>(){

    private val itemsStack: MutableList<T> = mutableListOf()


    fun push(item: T){
        itemsStack.add(item)

    }

    fun pop(): T?{
        return if (itemsStack.isNotEmpty()){
            itemsStack.removeLast()
        }
        else{
            println("La pila está vacía.")
            null  // al ser tipo T? pide que des un valor nulable
        }
    }

    fun top(): T?{
        return if (itemsStack.isNotEmpty()){
            itemsStack.first()
        }
        else{
            println("La pila está vacía.")
            null // al ser tipo T? pide que des un valor nulable
        }
    }

//    fun isEmpty(): Boolean{                   <- comprobar esto porque hace literalmente lo contrario a .isNotEmpty
//        return itemsStack.isEmpty()
//    }
}

fun reverse(){


}




fun main() {



}



//Se usará este código para probar el correcto funcionamiento:

//var numbers = listOf("one", "two", "three", "four")
//var numbersRev:List = reverse(numbers)
//if (!listOf("four", "three", "two", "one").equals(numbersRev))
//println("Error")
//else
//println("Correcto")
//println(numbersRev)

//Realiza la misma prueba, pero con listas de otros tipos de datos...
//por ejemplo una lista que combine valores numéricos Int, Float y Double

//Otra con una lista de cualquier data class que te inventes.

//Comprueba también si podemos hacerlo con una lista de tipos de datos distintos...
//por ejemplo con una lista que contenga tipos de datos String, Int, Float, Usuario("Pepe", 30), Boolean...
//¿Por qué es posible usarla si parece que la lista contiene tipos de datos diferentes?