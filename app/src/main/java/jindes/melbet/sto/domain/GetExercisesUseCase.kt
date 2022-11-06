package jindes.melbet.sto.domain

import jindes.melbet.sto.domain.entities.Exercise

class GetExercisesUseCase(private val repository: Repository) {
    operator fun invoke(): List<Exercise> {
        return repository.getExercise()
    }
}