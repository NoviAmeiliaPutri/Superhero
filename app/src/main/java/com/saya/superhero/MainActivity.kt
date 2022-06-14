package com.saya.superhero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                nameSuperhero = "Ant-Man",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
                ),
            Superhero(
                R.drawable.black,
                nameSuperhero = "Black Panter",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "Captain America",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.doctor,
                nameSuperhero = "Doctor Stranger",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.gamora,
                nameSuperhero = "Gamora",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.hawkeye,
                nameSuperhero = "Hawkeye",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.iron,
                nameSuperhero = "Iron Man",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.loki,
                nameSuperhero = "Loki",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.marvel,
                nameSuperhero = "Marvel",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.nebula,
                nameSuperhero = "Nebula",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.panter,
                nameSuperhero = "Panter",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}