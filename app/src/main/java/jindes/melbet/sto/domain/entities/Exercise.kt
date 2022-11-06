package jindes.melbet.sto.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Exercise(
    val imgResourceId: Int,
    val name: String,
    val spec: String,
    val description: String
):Parcelable