package com.alienjo.kotlinfragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), MediatorInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun changeFragmentTo(fragmentToDisplay: Fragment, fragmentTag: String?) {
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.fl_host, fragmentToDisplay, fragmentTag)
        if (fm.findFragmentByTag(fragmentTag) == null) {
            ft.addToBackStack(fragmentTag)
        }
        ft.commit()
    }


}