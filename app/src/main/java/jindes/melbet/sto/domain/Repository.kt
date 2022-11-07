package jindes.melbet.sto.domain

import jindes.melbet.sto.domain.entities.WorkoutDay

interface Repository {
    fun getWorkoutDays(): List<WorkoutDay>
}