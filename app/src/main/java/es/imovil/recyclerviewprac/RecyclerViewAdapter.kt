package es.imovil.recyclerviewprac

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.imovil.recyclerviewprac.databinding.ItemLayoutBinding

class RecyclerViewAdapter(private val courses: MutableList<Course>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    fun addCourse(course: Course): Unit {
        courses.add(course)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Obtener el curso Actual
        val course = courses[position]
        // Colocar el nombre del curso y el profesor en el viewHolder
        holder.bind(course)
    }

    override fun getItemCount() = courses.size


    class ViewHolder(val itemBinding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(course: Course) {
            // Inicializar los dos TextView
            itemBinding.courseText.text = course.nombre
            itemBinding.teacherText.text = course.profesor
        }

    }

}

