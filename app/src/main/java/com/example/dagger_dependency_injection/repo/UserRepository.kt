package com.example.dagger_dependency_injection.repo

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveUser(email: String, password: String){
        Log.d("Dagger", "User Saved in Database")
    }

}