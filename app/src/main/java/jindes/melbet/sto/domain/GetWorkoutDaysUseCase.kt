package jindes.melbet.sto.domain

import jindes.melbet.sto.domain.entities.WorkoutDay

class GetWorkoutDaysUseCase(private val repository: Repository) {
    operator fun invoke(): List<WorkoutDay> {
        return repository.getWorkoutDays()
    }
}