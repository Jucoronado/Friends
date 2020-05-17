package com.gicogu.friends

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_entrada.view.*

class AdaptadorF : BaseAdapter {
    var listamigos = ArrayList<FrienDato>()
    var contexto: Context? = null


    constructor(contexto: Context, listamigos: ArrayList<FrienDato>) : super() {
        this.contexto = contexto
        this.listamigos = listamigos }

    override fun getCount(): Int {
        return listamigos.size }

    override fun getItem(position: Int): Any {
        return listamigos[position] }

    override fun getItemId(position: Int): Long {
        return position.toLong() }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var friends = this.listamigos[position]
        var inflator = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var inflatorfriend = inflator.inflate(R.layout.activity_entrada, null)


        inflatorfriend.imgf.setOnClickListener {
            val intent = Intent(contexto, Ranking::class.java)

            intent.putExtra("nombre", friends.nombre)
            intent.putExtra("imagen", friends.imagen)
            intent.putExtra("rankeo", inflatorfriend.rankeo2.getRating())

            contexto!!.startActivity(intent) }

        inflatorfriend.imgf.setImageResource(friends.imagen!!)
        inflatorfriend.nombref2.text = friends.nombre!!
        inflatorfriend.rankeo2.rating = friends.rankeo!!
        return inflatorfriend
    }
}