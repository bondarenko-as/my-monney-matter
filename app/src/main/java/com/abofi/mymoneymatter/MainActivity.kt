package com.abofi.mymoneymatter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abofi.mymoneymatter.data.money_accounting.database.dao.CashAccountDao

class MainActivity : AppCompatActivity() {
    lateinit var cashAccountDao: CashAccountDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}