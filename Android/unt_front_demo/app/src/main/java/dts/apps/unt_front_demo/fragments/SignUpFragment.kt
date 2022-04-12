package dts.apps.unt_front_demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dts.apps.unt_front_demo.databinding.FragmentSignupBinding

class SignUpFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentSignupBinding.inflate(inflater , container , false)
        return binding.root
    }
}