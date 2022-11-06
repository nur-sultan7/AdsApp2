package jindes.melbet.sto.data


import android.content.Context
import jindes.melbet.sto.R
import jindes.melbet.sto.domain.Repository
import jindes.melbet.sto.domain.entities.Exercise
import jindes.melbet.sto.domain.entities.WorkoutDay

class RepositoryImp(private val context: Context) : Repository {
    override fun getExercise(): List<WorkoutDay> {
        return mutableListOf<WorkoutDay>().apply {
            addAll(
                listOf(
                    WorkoutDay(
                        1,
                        "Sunday",
                        "CHEST AND TRICEPS",
                        mutableListOf<Exercise>().apply {
                            addAll(
                                listOf(
                                    Exercise(
                                        R.drawable.bench_press,
                                        "Bench press",
                                        "Sets 5 Reps 10 Tempo 2010 Rest 60sec",
                                        "Lie on a flat bench holding a barbell with your hands slightly wider than shoulder-width apart. Brace your core, then lower the bar towards your chest. Press it back up to the start."
                                    ),
                                    Exercise(

                                    )
                                )

                            )
                        }
                    )
                )
            )
        }
    }
}