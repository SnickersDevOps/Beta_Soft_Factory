package dts.apps.unt_front_demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dts.apps.unt_front_demo.R
import dts.apps.unt_front_demo.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentLoginBinding.inflate(inflater , container , false)
        binding.btnLoginLogin.setOnClickListener {
            if (binding.editTextEmailLogin.text.toString().isEmpty()) {
                Toast.makeText(context, "Please enter Email", Toast.LENGTH_SHORT).show()
            } else if (binding.editTextPasswordLogin.text.toString().isEmpty()) {
                Toast.makeText(context, "Please enter Password", Toast.LENGTH_SHORT).show()
            } else {
                view?.findNavController()?.navigate(R.id.action_loginFragment_to_coursesFragment)
            }
        }
        return binding.root
    }
}