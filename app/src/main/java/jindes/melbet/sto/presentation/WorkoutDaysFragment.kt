package jindes.melbet.sto.presentation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import jindes.melbet.sto.R

import jindes.melbet.sto.databinding.FragmentDefaultBinding
import jindes.melbet.sto.domain.entities.WorkoutDay
import jindes.melbet.sto.presentation.adapters.WorkoutDaysAdapter


class WorkoutDaysFragment : Fragment() {

    private var _binding: FragmentDefaultBinding? = null
    private val binding: FragmentDefaultBinding
        get() = _binding ?: throw RuntimeException("FragmentDefaultBinding is null")

    private lateinit var adapter: WorkoutDaysAdapter

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory(requireActivity().application)
        )[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDefaultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvWorkoutDays.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        adapter = WorkoutDaysAdapter()
        binding.rvWorkoutDays.adapter = adapter
        adapter.submitList(viewModel.getAllWorkOutDays())
        setOnItemClickListener()
    }

    private fun setOnItemClickListener() {
        adapter.setOnClickListener = {
            launchDetailFragment(it)
        }
    }

    private fun launchDetailFragment(workoutDay: WorkoutDay) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ExercisesFragment.newInstance(workoutDay))
            .addToBackStack(null)
            .commit()
    }

    companion object {
        fun newInstance(): WorkoutDaysFragment {
            return WorkoutDaysFragment()
        }
    }
}