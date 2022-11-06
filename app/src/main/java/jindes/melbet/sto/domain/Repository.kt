package jindes.melbet.sto.domain

interface Repository {
    fun getExercise(): List<Exercise>
}