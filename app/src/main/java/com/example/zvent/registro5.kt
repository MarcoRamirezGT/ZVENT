package com.example.zvent

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.registro5_fragment.*


class registro5 : Fragment() {

    companion object {
        fun newInstance() = registro5()
    }

    private lateinit var viewModel: Registro5ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registro5_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Registro5ViewModel::class.java)
        // TODO: Use the ViewModel
        btnR5False.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
        btnR5True.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
    }

}
