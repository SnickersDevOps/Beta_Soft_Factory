package dts.apps.unt_front_demo.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
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

        binding.editTextEmailSignup.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if (p0.isValidEmail()) {
                    binding.editTextEmailSignup.error = null
                    binding.btnSignupSignup.setOnClickListener {
                        view?.findNavController()?.navigate(R.id.action_signUpFragment_to_loginFragment)
                    }
                }
                else { binding.editTextEmailSignup.error = "Invalid Email" }
            }

            override fun afterTextChanged(p0: Editable?) {

            }
        })

        return binding.root

    }
    fun CharSequence?.isValidEmail():Boolean{
        return !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }

    }