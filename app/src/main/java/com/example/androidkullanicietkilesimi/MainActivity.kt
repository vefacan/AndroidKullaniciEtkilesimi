package com.example.androidkullanicietkilesimi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonNormal.setOnClickListener {
            Toast.makeText(this@MainActivity,"Merhaba!!",Toast.LENGTH_SHORT).show()
        }


        buttonOzel.setOnClickListener {

            val tasarim = layoutInflater.inflate(R.layout.toast_tasarim,null)
            val textviewMesaj = tasarim.findViewById(R.id.textViewMesaj) as TextView
            textviewMesaj.text = "Merhaba Özel Mesaj"
            val toastOzel = Toast(applicationContext)
            toastOzel.view = tasarim
            toastOzel.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL,0,0)
            toastOzel.duration = Toast.LENGTH_SHORT
            toastOzel.show()
        }

        buttonToPopUp.setOnClickListener {
            startActivity(Intent(this@MainActivity,PopUp::class.java)) }


    }
}