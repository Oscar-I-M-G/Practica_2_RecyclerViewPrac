package es.imovil.recyclerviewprac

data class Course (
    val nombre: String,
    val profesor: String

)

companion object {
    fun createCourseList(asignaturas: Array<String>, profesores)
}