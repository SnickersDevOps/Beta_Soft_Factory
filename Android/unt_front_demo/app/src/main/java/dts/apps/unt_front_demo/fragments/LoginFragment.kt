package dts.apps.unt_front_demo.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dts.apps.unt_front_demo.R
import dts.apps.unt_front_demo.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.editTextEmailLogin.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if (binding.editTextEmailLogin.text.toString().isEmpty() or binding.editTextPasswordLogin.text.toString().isEmpty()
                ) {
                   binding.editTextPasswordLogin.setError("Invalid Password")
                }
                else {
                    if (android.util.Patterns.EMAIL_ADDRESS.matcher(binding.editTextEmailLogin.text.toString()).matches()
                    ) {
                        binding.btnLoginLogin.setOnClickListener {
                            view?.findNavController()
                                ?.navigate(R.id.action_loginFragment_to_coursesFragment)
                        }
                    } else {
                        binding.editTextEmailLogin.setError("Invalid Email")
                    }
                }

            }

            override fun afterTextChanged(p0: Editable?) {

            }
        })

        return binding.root
    }
}