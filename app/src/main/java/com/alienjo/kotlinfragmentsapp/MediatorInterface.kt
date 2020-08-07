package com.alienjo.kotlinfragmentsapp

import androidx.fragment.app.Fragment

interface MediatorInterface {
    fun changeFragmentTo(fragmentToDisplay: Fragment, fragmentTag : String?)
}