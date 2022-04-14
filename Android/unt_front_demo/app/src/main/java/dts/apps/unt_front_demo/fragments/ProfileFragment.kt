package dts.apps.unt_front_demo.fragments

import android.app.ActionBar
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.component4
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dts.apps.unt_front_demo.R
import dts.apps.unt_front_demo.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentProfileBinding.inflate(inflater , container , false)

        binding.btnEditProfile.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_profileFragment_to_editProfileFragment)
        }
        binding.btnAboutDevelopers.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_profileFragment_to_aboutDevelopersFragment)
        }

        return binding.root

    }

}