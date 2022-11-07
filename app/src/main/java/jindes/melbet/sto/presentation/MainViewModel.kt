package jindes.melbet.sto.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import jindes.melbet.sto.data.RepositoryImp
import jindes.melbet.sto.domain.GetWorkoutDaysUseCase
import jindes.melbet.sto.domain.entities.WorkoutDay

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repositoryImp = RepositoryImp(application)
    private val getExercisesUseCase = GetWorkoutDaysUseCase(repositoryImp)

    fun getAllWorkOutDays(): List<WorkoutDay> {
        return getExercisesUseCase.invoke()
    }

}