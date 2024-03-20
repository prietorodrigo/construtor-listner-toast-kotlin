package com.example.construtorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.construtorkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var txtView: TextView
    private lateinit var button: Button
    private lateinit var a: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        a= ActivityMainBinding.inflate(layoutInflater)
        setContentView(a.root)

        txtView = findViewById<TextView>(R.id.txtView)
        button = findViewById<Button>(R.id.button)

        a.button.setOnClickListener {
            // Primeiro cachorro
            var cachorro1 = Cachorro()
            cachorro1.setNome("Sasha")
            cachorro1.setRaca("Weimaraner")
            cachorro1.setIdade(2)
            cachorro1.setCor("Cinza")

            // Segundo cachorro
            var cachorro2 = Cachorro("Candy", "Poodle", 3, "Branco")

            // Terceiro cachorro
            var cachorro3 = Cachorro()
            cachorro3.setNome("Raí")
            cachorro3.setRaca("Collie")
            cachorro3.setIdade(3)
            cachorro3.setCor("Amarelo")


            a.txtView.text = "Cachorro 1:\nNome: ${cachorro1.getNome()}\nRaca: ${cachorro1.getRaca()}\nIdade: ${cachorro1.getIdade()}\nCor: ${cachorro1.getCor()}\n\n" +
                             "Cachorro 2:\nNome: ${cachorro2.getNome()}\nRaca: ${cachorro2.getRaca()}\nIdade: ${cachorro2.getIdade()}\nCor: ${cachorro2.getCor()}\n\n" +
                             "Cachorro 3:\nNome: ${cachorro3.getNome()}\nRaca: ${cachorro3.getRaca()}\nIdade: ${cachorro3.getIdade()}\nCor: ${cachorro3.getCor()}"
        }
    }
}