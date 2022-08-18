package com.example.androidkullanicietkilesimi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_pop_up.*

class PopUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_up)


        buttonMenu.setOnClickListener {

            val popUp = PopupMenu(this@PopUp,buttonMenu)
            popUp.menuInflater.inflate(R.menu.popup_menu,popUp.menu)

            popUp.setOnMenuItemClickListener { item ->

                when(item.itemId){
                    R.id.action_sil -> {
                        Toast.makeText(applicationContext,"Sil Seçildi.",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_duzenle -> {
                        Toast.makeText(applicationContext,"Düzenle Seçildi.",Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
            popUp.show()
        }

        buttonAlertNormal.setOnClickListener {

            val ad = AlertDialog.Builder(this@PopUp)

            ad.setMessage("Alert Mesaj :)")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim_voleybol)
            ad.create().show()
        }


        buttonAlertOzel.setOnClickListener {

            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)

            val editTextAlert = tasarim.findViewById(R.id.editTextAlert) as EditText

            val ad = AlertDialog.Builder(this@PopUp)

            ad.setMessage("Alert Mesaj :)")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim_voleybol)
            ad.setView(tasarim)
            ad.create().show()
        }

        buttonToSnackBar.setOnClickListener {

            startActivity(Intent(this@PopUp,SnackBar::class.java))
        }


    }
    }

