package com.example.zvent
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.resultados_fragment.*


class resultados : Fragment() {

    companion object {
        fun newInstance() = resultados()
    }

    private lateinit var viewModel: ResultadosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.resultados_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ResultadosViewModel::class.java)

        // TODO: Use the ViewModel



        btnRegisters.setOnClickListener() {
            findNavController().navigate(R.id.restart)





        }
        btnRestart.setOnClickListener(){
            findNavController().navigate(R.id.restart)
        }

    }

}
