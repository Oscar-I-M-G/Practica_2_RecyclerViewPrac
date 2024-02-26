package es.imovil.recyclerviewprac

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import es.imovil.recyclerviewprac.databinding.ItemLayoutBinding

class RecyclerViewAdapter(private val courses:List<Course>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(itemBinding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cursoActual = courses[position]
        holder.bind(cursoActual)
        //Obtener el curso Actual
        //Colocar el nombre del curso y el profesor en el viewHolder
    }

    override fun getItemCount() =courses.size

    class ViewHolder(val itemBinding: ItemLayoutBinding) : RecyclerView.ViewHolder(itemBinding.root){
        fun bind(course: Course){
            //inicializar lod dos textview
            itemBinding.tvCourse.text = course.nombre
            itemBinding.tvTeacher.text = course.profesor
        }
    }
}