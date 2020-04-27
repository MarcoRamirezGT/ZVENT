package com.example.zvent

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.registro1_fragment.*
import java.nio.BufferUnderflowException


class registro1 : Fragment() {

    companion object {
        fun newInstance() = registro1()
    }

    private lateinit var viewModel: Registro1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.registro1_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Registro1ViewModel::class.java)
        // TODO: Use the ViewModel

        btnR1True.setOnClickListener(){
            val regis = resultados()
            val manager= fragmentManager
            val frag_tr= manager?.beginTransaction()

            frag_tr?.replace(R.id.fragment_container_view_tag,regis)
            frag_tr?.commit()
            val bundle = Bundle()
            bundle.putString("r1", "No")
            regis.arguments= bundle




            findNavController().navigate(R.id.next_action)

        }
        btnR1False.setOnClickListener(){
            findNavController().navigate(R.id.next_action)
        }
    }


}
