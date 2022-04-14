package dts.apps.unt_front_demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import dts.apps.unt_front_demo.R
import dts.apps.unt_front_demo.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private var binding: FragmentWelcomeBinding? = null
    private val out_binding get() = binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentWelcomeBinding.inflate(inflater , container , false)

        binding.btnLoginWelcome.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
        binding.btnSignUpWelcome.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_welcomeFragment_to_signUpFragment)
        }

        return binding.root
    }

}