package com.example.proyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView


/**
 * A simple [Fragment] subclass.
 * Use the [pago_informacion.newInstance] factory method to
 * create an instance of this fragment.
 */
class pago_informacion(fragment_pago_informacion: Any) : Fragment() {






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_pago_informacion, container, false)

    }


}