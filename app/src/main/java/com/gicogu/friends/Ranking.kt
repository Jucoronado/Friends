package com.gicogu.friends

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_entrada.view.*
import kotlinx.android.synthetic.main.activity_ranking.*

class Ranking : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)

        val prefs: SharedPreferences = getSharedPreferences("Preferencias", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = prefs.edit()

        val bundle = intent.extras

        nombreF.setText(bundle?.getString("nombre"))
        friendImagen.setImageResource(bundle!!.getInt("imagen"))
        rankeo.setRating(bundle.getFloat("rankeo"))

        btm.setOnClickListener {
            editor.putFloat(bundle.getString("nombre"), bundle.getFloat("rankeo"))
            editor.commit()
            finish()
        } }}

