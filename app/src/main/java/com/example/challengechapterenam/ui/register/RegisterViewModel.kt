package com.example.challengechapterenam.ui.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.challengechapterenam.data.repository.NetworkRepository
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(private val networkRepository: NetworkRepository) : ViewModel() {
    private val _register = MutableLiveData<String>()
    val register: LiveData<String> = _register

    fun registerFirebase(email: String, password: String) =
        Firebase.auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            if (it.isSuccessful) {
                _register.postValue("Register Success!")
            } else {
                _register.postValue(it.exception.toString())
            }
        }


}