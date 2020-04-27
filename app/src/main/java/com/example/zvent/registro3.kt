
package com.example.zvent

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.registro3_fragment.*


class registro3 : Fragment() {

    companion object {
        fun newInstance() = registro3()
    }

    private lateinit var viewModel: Registro3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registro3_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Registro3ViewModel::class.java)
        // TODO: Use the ViewModel
        btnR3True.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
        btnR3False.setOnClickListener(){
            findNavController().navigate(R.id.next_action)

        }
    }

}
