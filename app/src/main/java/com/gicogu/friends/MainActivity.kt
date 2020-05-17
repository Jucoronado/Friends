package com.gicogu.friends

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var adaptador: AdaptadorF? = null
    private var listF = ArrayList<FrienDato>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prefs: SharedPreferences = getSharedPreferences("Preferencias", Context.MODE_PRIVATE)

        listF.add(FrienDato("Chandler", R.drawable.chandler, prefs.getFloat("Chandler", 0f)))
        listF.add(FrienDato("Joey", R.drawable.joey, prefs.getFloat("Joey", 0f)))
        listF.add(FrienDato("Monica", R.drawable.monica, prefs.getFloat("Monica", 0f)))
        listF.add(FrienDato("Phoebe", R.drawable.phoebe, prefs.getFloat("Phoebe", 0f)))
        listF.add(FrienDato("Rachel", R.drawable.rachel, prefs.getFloat("Rachel", 0f)))
        listF.add(FrienDato("Ross", R.drawable.ross, prefs.getFloat("Ross", 0f)))

        adaptador = AdaptadorF(this, listF)
        adaptador!!.notifyDataSetChanged()
        for (x in listF) {
            var log = prefs.getFloat(x.nombre, 0f)
        }

        idfriend.adapter = adaptador

    }

}
