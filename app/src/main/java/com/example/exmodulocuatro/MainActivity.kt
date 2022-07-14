package com.example.exmodulocuatro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.exmodulocuatro.SharedPreferences.Companion.prefs
import com.example.exmodulocuatro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        initUI()
        checkUserValues()

    }

    fun initUI(){
        b.bLogin.setOnClickListener {
            accessSharedPreferences()
        }
    }
    fun checkUserValues(){
        if(prefs.getName().isNotEmpty()){
            goAccess()
        }
    }
    fun accessSharedPreferences(){
        if (b.etUsername.text.toString().isNotEmpty()){
            prefs.saveName(b.etUsername.text.toString())
            prefs.savePass(b.etPass.toString())
            goAccess()
        }else{
            Toast.makeText(this, "Debe rellenar el nombre", Toast.LENGTH_SHORT).show()
        }
    }
    private fun goAccess(){
        startActivity(Intent(this, SecondActivity::class.java))
    }
}
