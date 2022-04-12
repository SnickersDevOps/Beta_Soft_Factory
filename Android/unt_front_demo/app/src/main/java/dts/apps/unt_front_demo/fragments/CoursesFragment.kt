package dts.apps.unt_front_demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import androidx.fragment.app.Fragment
import dts.apps.unt_front_demo.constants.CoursesConstant
import dts.apps.unt_front_demo.databinding.FragmentCoursesBinding
import dts.apps.unt_front_demo.entities.Courses

class CoursesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentCoursesBinding.inflate(inflater , container , false)
        return binding.root
    }



}