package com.example.androidkullanicietkilesimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snack_bar.*

class SnackBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)


        buttonSnackBarNormal.setOnClickListener { view ->
            Snackbar.make(view,"Merhaba",Snackbar.LENGTH_SHORT).show()
        }

        buttonSnackBarGeriDonus.setOnClickListener { nesne ->

            Snackbar.make(nesne,"Mesaj Silinsin mi?",Snackbar.LENGTH_SHORT)
                .setAction("Sil"){ nesne ->

                    Snackbar.make(nesne,"Mesaj Silindi.",Snackbar.LENGTH_SHORT).show()
                }
                .show()
        }

        buttonSnackBarOzel.setOnClickListener { ozel->

            val sb = Snackbar.make(ozel,"İnternet Bağlantısı Yok!",Snackbar.LENGTH_LONG)
            sb.setAction("Tekrar Dene!"){ }
            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.BLUE)
            sb.setBackgroundTint(Color.WHITE)
            sb.show()
        }
    }
}