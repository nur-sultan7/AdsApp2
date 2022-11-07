package jindes.melbet.sto.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WorkoutDay(
    val imgId: Int,
    val name: String,
    val spec: String,
    val exercises: List<Exercise>
) : Parcelable