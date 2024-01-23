package com.maodev.timetonicapp.ui.loginScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maodev.timetonicapp.data.APIService
import com.maodev.timetonicapp.data.model.authkey.CreateAuthKey
import com.maodev.timetonicapp.data.model.sesskey.CreateSesskey
import com.maodev.timetonicapp.data.repository.BooksRepository
import kotlinx.coroutines.launch


class LoginViewModel(
    private val repository: BooksRepository = BooksRepository(APIService.instance)
) :
    ViewModel() {
    private val _email = MutableLiveData<String>()
    private val _password = MutableLiveData<String>()
    val email: LiveData<String> = _email
    val password: LiveData<String> = _password
    suspend fun createSesskey(authKey: CreateAuthKey): CreateSesskey {
        return repository.createSessionkey(authKey.oU, authKey.oU, authKey.oauthkey)
    }

    fun createAuthkey(email: String, password: String) {
        viewModelScope.launch {
            val authkey = repository.createAuthKey(email, password)
            createSesskey(authkey)
        }
    }

    fun onLoginChanged(email: String, password: String) {
        _email.value = email
        _password.value = password
    }
}