package com.example.coba2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.intro_layout.*

class IntroPage : Fragment() {

    var position = 0
    val mResources = intArrayOf(R.drawable.cycling, R.drawable.airplane, R.drawable.kick_scooter, R.drawable.firefighter)

    fun newInstance(position: Int): IntroPage {
        val fragment = IntroPage()
        val arguments = Bundle()
        arguments.putInt("POSITION", position)
        fragment.setArguments(arguments)
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater!!.inflate(R.layout.intro_layout, container, false);
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val args = arguments
        position = args?.getInt("POSITION")!!


        introImage.setImageDrawable(resources.getDrawable(mResources[position]))


    }
}
