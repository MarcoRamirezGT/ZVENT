package com.example.zvent

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.registro2_fragment.*


class registro2 : Fragment() {

    companion object {
        fun newInstance() = registro2()
    }

    private lateinit var viewModel: Registro2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registro2_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Registro2ViewModel::class.java)
        // TODO: Use the ViewModel
      btnR2True.setOnClickListener(){
          findNavController().navigate(R.id.next_action)

      }
        btnR2False.setOnClickListener(){
            findNavController().navigate(R.id.next_action)

        }
    }

}
