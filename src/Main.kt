package main

fun main() {


    val admin = Admin("Paul", POSITION.Admin)

    admin.employStaff(Staff("Paul", POSITION.Principal))

    println(admin.totalStaff.size.toString())

//    var michael = Principal("Michael", "Principal")
//    println()
//
//    var newApplicant1 = Applicant("John", 23, 80)


//    var newApplicant2 = Applicant("Mary", 21, 85)

//    var student1 = Student("Mike", 20)
//
//    student1.updateStudentProfile("Science", "SS 2")
//
//    println(student1.department)
//
//    michael.applicantAdmissionStatus(newApplicant2)
//    michael.applicantAdmissionStatus(newApplicant1)

//    michael.admitApplicant()

//    println(michael.admittedStudentList)
//    println(michael.admittedStudentList.size.toString())
////

//    println(michael.admittedStudentList.toList())
//    michael.expelStudent(newApplicant2)
//
//    newApplicant1.offence = true
//    student1.department = "Science"
//
//    for (i in michael.admittedStudentList) {
//        println(i.toString())
//    }
//    student1.takeCourse()

}