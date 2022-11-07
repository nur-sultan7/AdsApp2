package jindes.melbet.sto.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jindes.melbet.sto.databinding.ItemExercisesBinding
import jindes.melbet.sto.domain.entities.Exercise

class ExercisesAdapter : ListAdapter<Exercise, ExercisesAdapter.ViewHolder>(DiffUtilExercises) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val exercise = getItem(position)
        holder.bing(exercise)
    }

    class ViewHolder(private val binding: ItemExercisesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bing(exercise: Exercise) {
            binding.ivExercise.setImageResource(exercise.imgResourceId)
            binding.tvName.text = exercise.name
            binding.tvSpec.text = exercise.spec
            binding.tvDescription.text = exercise.description
        }

        companion object {
            fun create(view: ViewGroup): ViewHolder {
                return ViewHolder(
                    ItemExercisesBinding.inflate(
                        LayoutInflater.from(view.context),
                        view,
                        false
                    )
                )
            }
        }
    }

    object DiffUtilExercises : DiffUtil.ItemCallback<Exercise>() {
        override fun areItemsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
            return oldItem == newItem
        }
    }
}