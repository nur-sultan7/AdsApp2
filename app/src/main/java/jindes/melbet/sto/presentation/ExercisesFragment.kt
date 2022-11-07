package jindes.melbet.sto.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import jindes.melbet.sto.databinding.FragmentDetailsBinding
import jindes.melbet.sto.domain.entities.WorkoutDay
import jindes.melbet.sto.presentation.adapters.ExercisesAdapter


class ExercisesFragment : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding: FragmentDetailsBinding
        get() = _binding ?: throw RuntimeException("FragmentDetailsBinding is null")
    private lateinit var workoutDay: WorkoutDay
    private val adapter: ExercisesAdapter by lazy {
        ExercisesAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        parseArgs()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            rvExercises.layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvExercises.adapter = adapter
            adapter.submitList(workoutDay.exercises)
        }
    }

    private fun parseArgs() {
        workoutDay = arguments?.getParcelable(EXERCISE_KEY)
            ?: throw RuntimeException("Workout day in null")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val EXERCISE_KEY = "workout day"
        fun newInstance(workoutDay: WorkoutDay): ExercisesFragment {
            return ExercisesFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(EXERCISE_KEY, workoutDay)
                }
            }
        }
    }
}