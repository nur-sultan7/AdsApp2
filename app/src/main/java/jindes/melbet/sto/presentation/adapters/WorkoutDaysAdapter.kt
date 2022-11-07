package jindes.melbet.sto.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import jindes.melbet.sto.databinding.ItemWorkoutDayBinding
import jindes.melbet.sto.domain.entities.WorkoutDay


class WorkoutDaysAdapter :
    ListAdapter<WorkoutDay, WorkoutDaysAdapter.ViewHolderExercise>(DiffUtilWorkoutDays) {

    lateinit var setOnClickListener: (workoutDay: WorkoutDay) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderExercise {
        return ViewHolderExercise.create(parent)
    }

    override fun onBindViewHolder(holder: ViewHolderExercise, position: Int) {
        val workoutDay = getItem(position)
        holder.bind(workoutDay)
        holder.itemView.setOnClickListener {
            setOnClickListener.invoke(workoutDay)
        }
    }

    class ViewHolderExercise(private val binding: ItemWorkoutDayBinding) :
        ViewHolder(binding.root) {
        fun bind(workoutDay: WorkoutDay) {
            binding.tvDayOfWeek.text = workoutDay.name
            binding.tvSpec.text = workoutDay.spec
            binding.ivWorkoutDay.setImageResource(workoutDay.imgId)
        }

        companion object {
            fun create(view: ViewGroup): ViewHolderExercise {
                val binding =
                    ItemWorkoutDayBinding.inflate(
                        LayoutInflater.from(view.context),
                        view,
                        false
                    )
                return ViewHolderExercise(binding)
            }
        }

    }
}