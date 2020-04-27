package com.example.zvent

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.registro10_fragment.*


class registro10 : Fragment() {

    companion object {
        fun newInstance() = registro10()
    }

    private lateinit var viewModel: Registro10ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registro10_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Registro10ViewModel::class.java)
        // TODO: Use the ViewModel
        btnR10True.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
        btnR10True.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
    }

}
