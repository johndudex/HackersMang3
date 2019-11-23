import java.util.ArrayList
import kotlin.concurrent.thread

class KotlinJavaReadibility {

}



fun main() {
    var a = Person("John")
    var b = Person("John")


    var thread_list = ArrayList<Thread>()

    for (i in 0 .. 10 ){
        var t: Thread = thread {
            println("Thread no ${i} started")
            Thread.sleep(5000)
            print("Thread no ${i} Stopped")

        }
        thread_list.add(t)
    }
    thread_list.forEach{ it.join()}

}




class Person (name: String){
    var personname = name

    infix fun add(person: Person):String {
        return "${this.personname} ${person.personname}"
    }
}


class Human (gender: String) {
}

