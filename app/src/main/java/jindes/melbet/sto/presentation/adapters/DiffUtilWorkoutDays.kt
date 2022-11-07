package jindes.melbet.sto.presentation.adapters

import androidx.recyclerview.widget.DiffUtil
import jindes.melbet.sto.domain.entities.WorkoutDay

object DiffUtilWorkoutDays : DiffUtil.ItemCallback<WorkoutDay>() {
    override fun areItemsTheSame(oldItem: WorkoutDay, newItem: WorkoutDay): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: WorkoutDay, newItem: WorkoutDay): Boolean {
        return oldItem == newItem
    }

}