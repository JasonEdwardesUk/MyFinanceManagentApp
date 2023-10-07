package com.edwardes.myfinancemanagentapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.edwardes.myfinancemanagentapp.database.Expense
import com.edwardes.myfinancemanagentapp.repository.ExpenseRepository

class ExpenseViewModel(private val repository: ExpenseRepository) : ViewModel() {

    fun getAllExpenses(): LiveData<List<Expense>> {
        return repository.getAllExpenses()
    }

    fun insertExpense(expense: Expense) {
        repository.insertExpense(expense)
    }
}