package com.edwardes.myfinancemanagentapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.edwardes.myfinancemanagentapp.database.Expense

//handling database operations.
@Dao
interface ExpenseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExpense(expense: Expense)

    @Query("SELECT * FROM expenses")
    fun getAllExpenses(): LiveData<List<Expense>>

    // Other database operations...
}