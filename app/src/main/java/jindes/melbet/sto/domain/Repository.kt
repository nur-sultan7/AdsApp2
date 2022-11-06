package jindes.melbet.sto.domain

import jindes.melbet.sto.domain.entities.Exercise
import jindes.melbet.sto.domain.entities.WorkoutDay

interface Repository {
    fun getExercise(): List<WorkoutDay>
}