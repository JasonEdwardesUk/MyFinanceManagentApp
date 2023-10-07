package com.edwardes.myfinancemanagentapp.repository

import androidx.lifecycle.LiveData
import com.edwardes.myfinancemanagentapp.database.Expense
import com.edwardes.myfinancemanagentapp.database.ExpenseDao

class ExpenseRepository(private val expenseDao: ExpenseDao) {

    private val allExpenses: LiveData<List<Expense>> = expenseDao.getAllExpenses()

    fun getAllExpenses(): LiveData<List<Expense>> {
        return allExpenses
    }

    fun insertExpense(expense: Expense) {
        // Insert expense into the database (you should have this method in your DAO)
        // You can do it asynchronously if your DAO methods are suspend functions.
    }
}