package com.maodev.timetonicapp.data.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maodev.timetonicapp.data.APIService
import com.maodev.timetonicapp.data.BookState
import com.maodev.timetonicapp.data.repository.BooksRepository
import kotlinx.coroutines.launch

class GetAllBooksViewModel(
    private val repository: BooksRepository = BooksRepository(APIService.instance),
) : ViewModel() {
    var state by mutableStateOf(BookState())

    init {
        viewModelScope.launch {
            getAllBooks()
        }
    }

    fun getAllBooks() {
        viewModelScope.launch {
            state = state.copy(isLoading = true)
            repository.getAllBooks().onSuccess {
                state = state.copy(book = it)
            }.onFailure {
                println()
            }
        }
        state = state.copy(isLoading = false)
    }
}