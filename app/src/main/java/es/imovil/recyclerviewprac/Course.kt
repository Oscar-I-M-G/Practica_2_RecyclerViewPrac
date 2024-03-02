package es.imovil.recyclerviewprac

data class Course (
    val nombre: String,
    val profesor: String
    ){
    companion object {
        fun createCourseList(asignaturas: Array<String>, profesores: Array<String>): List<Course> {
            val courses = mutableListOf<Course>()
            if (asignaturas.size == profesores.size) {
                // Añadimos a la lista un objeto Course tomando un
                // elemento el array de asignaturas y otro de profesores
                // Sugerencia: usar la función zip
                val pairs = asignaturas.zip(profesores)
                pairs.forEach { (asignatura, profesor) ->
                    val course = Course(asignatura, profesor)
                    courses.add(course)
                }
            }
            return courses.toList()
        }
    }
}