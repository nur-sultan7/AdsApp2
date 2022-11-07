package jindes.melbet.sto.data


import android.content.Context
import jindes.melbet.sto.R
import jindes.melbet.sto.domain.Repository
import jindes.melbet.sto.domain.entities.Exercise
import jindes.melbet.sto.domain.entities.WorkoutDay

class RepositoryImp(private val context: Context) : Repository {
    override fun getWorkoutDays(): List<WorkoutDay> {
        return mutableListOf<WorkoutDay>().apply {
            addAll(
                listOf(
                    WorkoutDay(
                        R.drawable.workoutday1,
                        "Workout day 1",
                        "CHEST AND TRICEPS",

                        listOf(
                            Exercise(
                                R.drawable.bench_press,
                                "Bench press",
                                "Sets 5 Reps 10 Tempo 2010 Rest 60sec",
                                "Lie on a flat bench holding a barbell with your hands slightly wider than shoulder-width apart. Brace your core, then lower the bar towards your chest. Press it back up to the start."
                            ),
                            Exercise(
                                R.drawable.triceps_dip,
                                "Triceps dip",
                                "Sets 5 Reps 6-10 Tempo 2110 Rest 60sec ",
                                "Grip rings or parallel bars with your arms straight. Keeping your chest up, bend your elbows to lower your body as far as your shoulders allow. Press back up powerfully to return to the start."
                            ),
                            Exercise(
                                R.drawable.incline_dumbbell_press,
                                "Incline dumbbell press",
                                "Sets 3 Reps 12-15 Tempo 2010 Rest 60sec ",
                                "Lie on an incline bench holding a dumbbell in each hand by your shoulders. Press the weights up until your arms are straight, then lower them back to the start under control."
                            ),
                            Exercise(
                                R.drawable.incline_dumbbell_flye,
                                "Incline dumbbell flye",
                                "Sets 3 Reps 12-15 Tempo 2010 Rest 60sec ",
                                "Lie on an incline bench holding a dumbbell in each hand above your face, with your palms facing and a slight bend in your elbows. Lower them to the sides, then bring them back to the top."
                            ),
                            Exercise(
                                R.drawable.triceps_extension,
                                "Triceps extension",
                                "Sets 3 Reps 12-15 Tempo 2010 Rest 60sec",
                                "Stand tall holding a dumbbell over your head with both hands, arms straight. Keeping your chest up, lower the weight behind your head, then raise it back to the start."
                            )
                        )
                    ),
                    WorkoutDay(
                        R.drawable.workoutday2,
                        "Workout day 2",
                        "BACK AND BICEPS",
                        listOf(
                            Exercise(
                                R.drawable.pull_up,
                                "Pull-up",
                                " Sets 5 Reps 6-10 Tempo 2011 Rest 60sec ",
                                "Hold a pull-up bar with an overhand grip, hands shoulder-width apart. Brace your core, then pull yourself up until your lower chest touches the bar. Lower until your arms are straight again.:Hold a pull-up bar with an overhand grip, hands shoulder-width apart. Brace your core, then pull yourself up until your lower chest touches the bar. Lower until your arms are straight again|Hold a pull-up bar with an overhand grip, hands shoulder-width apart. Brace your core, then pull yourself up until your lower chest touches the bar. Lower until your arms are straight again."
                            ),
                            Exercise(
                                R.drawable.bent_over_row,
                                "Bent-over row",
                                "Sets 5 Reps 10 Tempo 2010 Rest 60sec ",
                                "Hold a barbell using an overhand grip, hands just outside your legs, and lean forward from the hips. Bend your knees slightly and brace your core, then pull the bar up, leading with your elbows. Lower it back to the start."
                            ),
                            Exercise(
                                R.drawable.chin_up,
                                "Chin-up",
                                "Sets 3 Reps 6-10 Tempo 2011 Rest 60sec ",
                                "Hold a pull-up bar with hands shoulder-width apart, palms facing you. Brace your core, then pull yourself up until your chin is over the bar. Lower until your arms are straight again."
                            ),
                            Exercise(
                                R.drawable.standing_biceps_curl,
                                "Standing biceps curl",
                                "Sets 3 Reps 12-15 Tempo 2011 Rest 60sec ",
                                "Stand with dumbbells by your sides, palms facing forwards. Keeping your elbows tucked in, curl the weights up, squeezing your biceps at the top. Lower them back to the start."
                            ),
                            Exercise(
                                R.drawable.seated_incline_curl,
                                "Seated incline curl",
                                "Sets 3 Reps 12-15 Tempo 2011 Rest 60sec ",
                                "Sit on an incline bench with dumbbells by your sides, palms facing forwards. Keeping your elbows tucked in, curl the weights up, squeezing your biceps at the top. Lower them back to the start."
                            )
                        )
                    ),
                    WorkoutDay(
                        R.drawable.workoutday3,
                        "Workout day 3",
                        "LEGS AND ABS",
                        listOf(
                            Exercise(
                                R.drawable.back_quat,
                                "Back squat",
                                "Sets 5 Reps 10 Tempo 2010 Rest 60sec",
                                "Stand tall, holding a bar across the back of your shoulders. Keeping your chest up and core braced, squat down as deep as you can. Drive back up through your heels to return to the start."
                            ),
                            Exercise(
                                R.drawable.good_morning,
                                "Good morning",
                                "Sets 5 Reps 10 Tempo 2010 Rest 60sec",
                                "Stand tall holding a light barbell across the backs of your shoulders, feet shoulder-width apart. With your core braced, bend forwards slowly from the hips, as far as your hamstrings allow but not past horizontal. Return to the start."
                            ),
                            Exercise(
                                R.drawable.hip_thrust,
                                "Hip thrust",
                                "Sets 3 Reps 12-15 Tempo 2011 Rest 60sec",
                                "Sit with your upper back supported on a bench, holding a barbell across the tops of your thighs. Thrust your hips up, squeeze your glutes at the top, and then return to the start."
                            ),
                            Exercise(
                                R.drawable.incline_dumbbell_press,
                                "Incline dumbbell press",
                                "Sets 3 Reps 12-15 Tempo 2010 Rest 60sec ",
                                "Lie on an incline bench holding a dumbbell in each hand by your shoulders. Press the weights up until your arms are straight, then lower them back to the start under control."
                            ),
                            Exercise(
                                R.drawable.incline_dumbbell_flye,
                                "Incline dumbbell flye",
                                "Sets 3 Reps 12-15 Tempo 2010 Rest 60sec ",
                                "Lie on an incline bench holding a dumbbell in each hand above your face, with your palms facing and a slight bend in your elbows. Lower them to the sides, then bring them back to the top."
                            )
                        )
                    ),
                    WorkoutDay(
                        R.drawable.workoutday4,
                        "Workout day 4",
                        "BACK AND SHOULDERS",
                        listOf(
                            Exercise(
                                R.drawable.overhead_press,
                                "Overhead press",
                                "Sets 5 Reps 10 Tempo 2010 Rest 60sec",
                                "Hold a bar in front of your neck with your hands just wider than shoulder-width apart. Keeping your chest up and core braced, press the bar overhead until your arms are straight. Lower it back to the start."
                            ),
                            Exercise(
                                R.drawable.rack_pull,
                                "Rack pull",
                                "Sets 5 Reps 10 Tempo 2111 Rest 60sec",
                                "Stand tall in front of a barbell resting on safety bars at knee height. Bend and grasp the bar with an overhand grip, then stand up until your back is straight again, squeezing your shoulder blades together at the top."
                            ),
                            Exercise(
                                R.drawable.seated_dumbbell_press,
                                "Seated dumbbell press",
                                "Sets 3 Reps 12-15 Tempo 2010 Rest 60sec",
                                "Sit on an upright bench with a dumbbell in each hand at shoulder height. Keeping your chest up, press the weights directly overhead until your arms are straight, then lower them back to the start."
                            ),
                            Exercise(
                                R.drawable.lateral_raise,
                                "Lateral raise",
                                "Sets 3 Reps 12-15 Tempo 2011 Rest 60sec",
                                "Stand tall, holding a light dumbbell in each hand with palms facing. Keeping your chest up and a bend in your elbows, raise the weights out to shoulder height, then lower back to the start."
                            ),
                            Exercise(
                                R.drawable.reverse_flye,
                                "Reverse flye",
                                "Sets 3 Reps 12-15 Tempo 2011 Rest 60sec",
                                "Bend forward from the hips holding a light dumbbell in each hand with palms facing. Keeping a slight bend in your elbows, raise the weights out to shoulder height, then lower back to the start."
                            )
                        )
                    )
                )
            )
        }
    }
}