package main

class Admin(val name: String, var Position: POSITION): Salary  {

    private var salary = 0

    // list of staff in school
    var totalStaff = mutableListOf<Staff>()

    // method to pay salary
    override fun paySalary(position: POSITION){
        when (Position) {
            POSITION.Principal -> {
                this.salary = 200_000
                println("${position.name} have been pain salary for the month")
            }
            POSITION.Teacher -> {
                this.salary = 150_000
                println("${position.name} have been pain salary for the month")
            }
            POSITION.Admin -> {
                this.salary = 100_000
                println("${position.name} have been pain salary for the month")
            }
        }
    }

    // method to employ staff
    fun employStaff(staff: Staff){
        totalStaff.add(staff)
        println("${staff.name} have been employed as a ${staff.Position}")
    }

    // method to disengage staff
    fun disEngageStaff(staff: Staff){
        totalStaff.remove(staff)
        println("${staff.name} have been relieved from duty as ${staff.Position}")

    }
}