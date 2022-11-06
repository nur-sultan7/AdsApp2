package jindes.melbet.sto.domain.entities

data class WorkoutDay(
    val imgId: Int,
    val name: String,
    val spec: String,
    val exercises: List<Exercise>
)