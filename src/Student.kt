package main

data class Student(var name: String, var age: Int){

    // initialize the variables later
    lateinit var schoolClass: String
    lateinit var department: Course

    // list of subjects taken by a student
    var subjectsTaken = mutableListOf<String>()

    var offence = false

    // function to update student profile
    fun updateStudentProfile(department: Course, schoolClass: String){
        this.schoolClass = schoolClass
        this.department = department
    }

    // arrays to allocate subjects based on department

    var generalSubjects: MutableList<String>
        get() = mutableListOf<String>("English", "Mathematics", "Civic", "Computer Studies", "Data Processing")
        set(value) = TODO()


    var scienceSubjects: MutableList<String>
        get() = mutableListOf<String>("Physics", "Chemistry", "Technical Drawing", "Geography", "Biology")
        set(value) = TODO()

    var artSubjects: MutableList<String>
        get() = mutableListOf<String>("Music", "History", "Creative Arts", "Religious studies")
        set(value) = TODO()

    var commercialSubjects: MutableList<String>
        get() = mutableListOf<String>("Economics", "Commerce", "Accounting", "Book Keeping")
        set(value) = TODO()

    // method for student to take course
    fun takeCourse(){
        when (department) {
            Course.SCIENCE -> {
                subjectsTaken = (generalSubjects + scienceSubjects).toMutableList()
                println("your subjects are: $subjectsTaken")
            }
            Course.ART -> {
                subjectsTaken = (generalSubjects + artSubjects).toMutableList()
                println("your subjects are: ${subjectsTaken}")
            }
            Course.COMMERCIAL -> {
                subjectsTaken = (generalSubjects + commercialSubjects).toMutableList()
                println("your subjects are: $subjectsTaken")
            }
        }
    }
}