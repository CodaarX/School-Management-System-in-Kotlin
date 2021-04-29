package main

class Principal(val name: String, var Position: String) {

    // list of applicants who passed the exam
    private var listOfSuccessfulApplicants = mutableListOf<Applicant>()

    // list of all admitted to the school
    private val admittedStudentList = ArrayList<Student>()

    // a method to admit students which takes in an applicant parameter
    fun applicantAdmissionStatus(newApplicant: Applicant) {

        // check if the applicant meets the requirements to be admitted
        if (newApplicant.age > 20 && newApplicant.score > 75) {

            // add applicant to list of successful applicants
            listOfSuccessfulApplicants.add(newApplicant)
            println("Congratulations ${newApplicant.name}, you have been admitted. Your score is ${newApplicant.score} and your age is ${newApplicant.age}.")

        } else {
            println("Sorry ${newApplicant.name}, you did not meet the requirements to be admitted. Your score is ${newApplicant.score} and your age is ${newApplicant.age}.")
        }

    }

    fun admitApplicant(){
        // map successful applicant to student for conversion
        listOfSuccessfulApplicants.mapTo(admittedStudentList) {
            Student(it.name, it.age)
        }
    }



    // method to expel student
    fun expelStudent() {
        // loop through the students in school to find student to be expelled
        for (student in admittedStudentList) {
            // check if student has committed an offence
            if (student.offence) {
                // remove student from list
                admittedStudentList.remove(student)
                println("${student.name} has been expelled!!!")
            }
        }
    }

}