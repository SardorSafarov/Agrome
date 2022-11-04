package com.example.zamin.agrome.localDb

import android.content.Context
import android.content.SharedPreferences

class SharedPerferenceHelper(val context: Context) {
    private var sharedPreferences = context.getSharedPreferences("AgromeDb",Context.MODE_PRIVATE)
    private lateinit var editor:SharedPreferences.Editor

    fun setOnboarding(onboarding:String){
        editor = sharedPreferences.edit()
        editor.putString("onboarding",onboarding)
        editor.commit()
    }

    fun getOnboarding() = sharedPreferences.getString("onboarding","empty").toString()

    fun setLanguage(language:String){
        editor = sharedPreferences.edit()
        editor.putString("language",language)
        editor.commit()
    }

    fun getLanguage() = sharedPreferences.getString("language","empty").toString()


}