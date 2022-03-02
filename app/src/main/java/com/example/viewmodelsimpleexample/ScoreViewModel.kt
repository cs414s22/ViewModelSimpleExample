package com.example.viewmodelsimpleexample

import androidx.lifecycle.ViewModel

// This class extends from ViewModel
class ScoreViewModel: ViewModel() {
    // A variable to keep track the score value
    var score = 0

    // this function increases the score variable
    fun increaseScore() {
        score++
    }

    // this function resets the value in the score variable
    fun resetScore() {
        score = 0
    }

}