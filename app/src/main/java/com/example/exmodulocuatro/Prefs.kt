package com.example.exmodulocuatro

import android.content.Context

class Prefs ( val context : Context){


        val DATABASE = "MyDB"
        val USER_NAME = "UserName"
        val PASS = "pass"
        val storage = context.getSharedPreferences(DATABASE, Context.MODE_PRIVATE)
        fun saveName (name:String){
            storage.edit().putString(USER_NAME, name).apply()
        }

        fun savePass (pass:String){
        storage.edit().putString(PASS, pass).apply()
        }
        fun getName():String{
            return storage.getString(USER_NAME,"")!!
        }
        fun getPass():String{
        return storage.getString(PASS,"")!!
        }


        fun wipeData() {
            storage.edit().clear().apply()
        }


}
