package jindes.melbet.sto.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import jindes.melbet.sto.data.RepositoryImp
import jindes.melbet.sto.domain.Exercise
import jindes.melbet.sto.domain.GetExercisesUseCase

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repositoryImp = RepositoryImp(application)
    private val getExercisesUseCase = GetExercisesUseCase(repositoryImp)

    fun getAllExercises(): List<Exercise> {
        return getExercisesUseCase.invoke()
    }

}