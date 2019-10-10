package com.example.reminderapp3.database

import androidx.room.*
import com.example.reminderapp3.model.Reminder

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminderTable")
    suspend fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)

}