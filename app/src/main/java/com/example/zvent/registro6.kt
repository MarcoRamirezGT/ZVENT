package com.example.zvent

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.registro5_fragment.*
import kotlinx.android.synthetic.main.registro6_fragment.*


class registro6 : Fragment() {

    companion object {
        fun newInstance() = registro6()
    }

    private lateinit var viewModel: Registro6ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registro6_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Registro6ViewModel::class.java)
        // TODO: Use the ViewModel
        btnR6True.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
        btnR6False.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
    }

}
