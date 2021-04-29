package main

open class Teacher (val name: String, var subject: String,  var position: String) {

    fun teachCourse(args: String) {
        println("Hello, my Name is $name, i will be your $subject Teacher.")
    }

}