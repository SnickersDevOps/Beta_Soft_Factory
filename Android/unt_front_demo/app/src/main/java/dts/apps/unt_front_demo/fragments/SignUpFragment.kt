package dts.apps.unt_front_demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dts.apps.unt_front_demo.R
import dts.apps.unt_front_demo.databinding.FragmentSignupBinding

class SignUpFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentSignupBinding.inflate(inflater , container , false)

        binding.btnSignupSignup.setOnClickListener {
            if (binding.editTextEmailSignup.text.toString().isEmpty()) { Toast.makeText(context , "Please enter Email" , Toast.LENGTH_SHORT).show() }
            else if (binding.editTextPasswordSignup.text.toString().isEmpty()) { Toast.makeText(context , "Please enter Password" , Toast.LENGTH_SHORT).show() }
            else { view?.findNavController()?.navigate(R.id.action_signUpFragment_to_loginFragment) }
        }
        return binding.root
    }

}