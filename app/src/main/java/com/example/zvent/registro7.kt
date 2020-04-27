package com.example.zvent

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.registro7_fragment.*


class registro7 : Fragment() {

    companion object {
        fun newInstance() = registro7()
    }

    private lateinit var viewModel: Registro7ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registro7_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Registro7ViewModel::class.java)
        // TODO: Use the ViewModel
        btnR7True.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
        btnR7False.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
    }

}
