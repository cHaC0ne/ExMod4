package com.example.exmodulocuatro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exmodulocuatro.SharedPreferences.Companion.prefs
import com.example.exmodulocuatro.databinding.ActivityMainBinding
import com.example.exmodulocuatro.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var b: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(b.root)
        initUi()

    }

    fun initUi() {
        b.bSkip.setOnClickListener {
            prefs.wipeData()
            onBackPressed()

        }
        b.bNext.setOnClickListener {
            onBackPressed()
        }

    }
}