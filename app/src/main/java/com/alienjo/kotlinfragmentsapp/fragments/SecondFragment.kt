package com.alienjo.kotlinfragmentsapp.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.alienjo.kotlinfragmentsapp.MediatorInterface
import com.alienjo.kotlinfragmentsapp.R


class SecondFragment : Fragment() {

    private var mMediatorCallback: MediatorInterface? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // cast the context to Mediator interface;
        mMediatorCallback = context as MediatorInterface
        // java equivalent::> mMediatorCallback = (MediatorInterface) context;
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val parentView = inflater.inflate(R.layout.fragment_second, container, false)

        val btnNext: Button = parentView.findViewById(R.id.btnNext);

        //onButtonClick change fragment to ThirdFragment!
        btnNext.setOnClickListener {
            //no need to check if mMediatorCallback is null as we are using "?" to be safe
            //SecondFragment:: class.simpleName >> "::" create run time static reference to a class; here we will get class name as fragmentTag!
            mMediatorCallback?.changeFragmentTo(ThirdFragment(), ThirdFragment::class.simpleName)
        }

        return parentView
    }
}

