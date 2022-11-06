package jindes.melbet.sto.presentation.adapters

import androidx.recyclerview.widget.DiffUtil
import jindes.melbet.sto.domain.entities.Exercise

object DiffUtilExercises : DiffUtil.ItemCallback<Exercise>() {
    override fun areItemsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem == newItem
    }
}