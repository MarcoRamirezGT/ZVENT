package com.example.zvent

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.registro8_fragment.*


class registro8 : Fragment() {

    companion object {
        fun newInstance() = registro8()
    }

    private lateinit var viewModel: Registro8ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registro8_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Registro8ViewModel::class.java)
        // TODO: Use the ViewModel
        btnR8True.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
        btnR8True.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
    }

}
