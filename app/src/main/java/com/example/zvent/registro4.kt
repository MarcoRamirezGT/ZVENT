package com.example.zvent

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.registro4_fragment.*


class registro4 : Fragment() {

    companion object {
        fun newInstance() = registro4()
    }

    private lateinit var viewModel: Registro4ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registro4_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Registro4ViewModel::class.java)
        // TODO: Use the ViewModel
        btnR4True.setOnClickListener(){
            findNavController().navigate(R.id.next_action)

        }
        btnR4False.setOnClickListener(){
            findNavController().navigate(R.id.next_action)

        }
    }

}
