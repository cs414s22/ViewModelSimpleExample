package com.example.viewmodelsimpleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var score = 0

    // Create an instance of our ViewModel
    // lateinit allows us to declare a variable first and then initialize it
    // some point in the future during our program's execution cycle.
    lateinit var viewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //ViewModelProvider returns an existing ViewModel if one exists,
        // or it creates a new one if it does not already exist.
        // Get an instance of our ViewModel using context
        // and then get the score

        viewModel = ViewModelProvider(this).get(ScoreViewModel::class.java)
        tv_number.text = viewModel.score.toString()

    }

    fun addOneButton(view: View){
        //score++
        //tv_number.text = score.toString()

        // call the increaseScore function to increase the score in viewmodel
        viewModel.increaseScore()
        // display the updated score
        tv_number.text = viewModel.score.toString()
    }

    fun resetButton(view: View){
        //score = 0
        //tv_number.text = score.toString()

        // call the resetScore function to reset the score in viewmodel
        viewModel.resetScore()
        // display the score
        tv_number.text = viewModel.score.toString()
    }
}