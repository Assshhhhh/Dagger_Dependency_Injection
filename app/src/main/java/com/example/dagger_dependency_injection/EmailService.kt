package com.example.dagger_dependency_injection

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail(to: String, from: String, body: String){
        Log.d("Dagger", "Email sent")
    }
}