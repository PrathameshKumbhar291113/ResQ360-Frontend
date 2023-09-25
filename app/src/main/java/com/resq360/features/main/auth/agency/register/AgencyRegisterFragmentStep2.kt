package com.resq360.features.main.auth.agency.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.resq360.R
import com.resq360.databinding.FragmentAgencyRegisterStep2Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AgencyRegisterFragmentStep2 : Fragment() {
    private lateinit var binding: FragmentAgencyRegisterStep2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAgencyRegisterStep2Binding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUi()
        setupObserver()
    }

    private fun setupObserver() {

    }
    private fun setupUi() {

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.agencyRegisterFragmentStep3)
        }
    }

}