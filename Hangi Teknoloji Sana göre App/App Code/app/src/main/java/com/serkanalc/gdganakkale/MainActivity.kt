package com.serkanalc.gdganakkale

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textViewYazı:TextView=findViewById(R.id.TextViewYazı)
        var imageView: ImageView=findViewById(R.id.ImageViewTech)

        var baslaButton: Button =findViewById(R.id.ButtonBasla)
        baslaButton.setOnClickListener{
            var rastgelesayi= (1..7).random()
            Toast.makeText(this, "Uygulama Başlatıldı", Toast.LENGTH_SHORT).show()

            when(rastgelesayi){

                1-> {imageView.setImageResource(R.drawable.kotlin); textViewYazı.text= "Kotlin"}
                2-> {imageView.setImageResource(R.drawable.flutter); textViewYazı.text= "Flutter"}
                3-> {imageView.setImageResource(R.drawable.firebase); textViewYazı.text= "Firebase"}
                4-> {imageView.setImageResource(R.drawable.cloud); textViewYazı.text= "Google Cloud"}
                5-> {imageView.setImageResource(R.drawable.assistant); textViewYazı.text= "Google Assistant"}
                6-> {imageView.setImageResource(R.drawable.angular); textViewYazı.text= "Angular"}
                else-> {imageView.setImageResource(R.drawable.tensorflow); textViewYazı.text= "Tensorflow"}
            }


        }
        var bitirButton:Button=findViewById(R.id.ButtonBitir)
        bitirButton.setOnClickListener{
            Toast.makeText(this, "@GDG Çanakkale", Toast.LENGTH_SHORT).show()

            imageView.setImageResource(R.drawable.gdg)
            textViewYazı.text="İyi günler dilerim!"
        }
    }
}