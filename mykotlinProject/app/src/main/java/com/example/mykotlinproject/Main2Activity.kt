package com.example.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent= intent
        val nim = intent.getStringExtra("nim")
        val nama=intent.getStringExtra("nama")
        val nilai= intent.getIntExtra("nilai",0)
        val ket:String
        if (nilai>=80){
            ket="A"
        }else if (nilai>=60){
            ket="B"
        }else if (nilai>=40){
            ket="C"
        }else if (nilai>=20){
            ket="D"
        }else if (nilai>=0){
            ket="E"
        }else if (nilai>100){
            ket="Kebanyakan"
        }else if (nilai<=0){
            ket="DO"
        }else{
            ket="---------------"
        }
        val hasil = findViewById<TextView>(R.id.textView)
        val keterangan = findViewById<TextView>(R.id.textView2)
        hasil.text = "NIM : "+ nim +"\nNama : "+ nama +"\nNilai : "+ nilai
        keterangan.text="Keterangan : "+ ket
    }
}
