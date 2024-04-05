package com.example.thehistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etname=findViewById<EditText>(R.id.Name).text
        val etage=findViewById<EditText>(R.id.Age).text
        val btnclear=findViewById<Button>(R.id.Clear)
        val btnGeneratehistory=findViewById<Button>(R.id.GenerateHistory)


        btnclear.setOnClickListener {
            etname.clear()
            etage.clear()
        }
        btnGeneratehistory.setOnClickListener {
            var result=findViewById<TextView>(R.id.Results)
            val etage=etage

            if (etage.toString().equals("20")){
              result.text= " You are ${etage.toString().toInt()},the same age as Jude Bellingham who is a football star"
            }else if (etage.toString().equals("21")){
                result.text="you are ${etage.toString().toInt()},the same age as Jenne Ortega who is an actress that has acted in famous series and movies"
            }else if (etage.toString().equals("22")){
                result.text="you are ${etage.toString().toInt()},the same age as Billie Eilish a pop star that has made song that has reached platinum"
            }else if (etage.toString().equals("23")){
                result.text="You are ${etage.toString().toInt()},the same age as Halle Baily a RnB artist that has made songs that has won awards with her twin sister"
            }else if (etage.toString().equals("24")){
                result.text="You are ${etage.toString().toString()},the same age as Ice spice a rapper who has made viral songs and even had a collaboration with Nicki Minaj"
            }else if (etage.toString().equals("25")){
                result.text="You are ${etage.toString().toInt()},the same age as Mr Beast a youtube star that gives his money to people that needs it more than him"
            }else if (etage.toString().equals("26")){
                result.text="You are ${etage.toString().toInt()},the same age as DDG a rapper that has made himself know in the work space because of his music"
            }else if (etage.toString().equals("27")){
                result.text="You are ${etage.toString().toInt()},the same age as Zendaya a actress that has made alot of movies that has beenseen by the biggest names"
            }else if (etage.toString().equals("28")){
                result.text="You are ${etage.toString().toInt()},the same age as Lucas Hernandez a soccer playerwho has won the world cup and been to a final in 2 years in a row"
            }else if (etage.toString().equals("29")){
                result.text="You are ${etage.toString().toInt()}, the same age as Lil baby a rapper who has made great songs even winning multiple awards"
            }else if(etage.toString().equals("30")){
                result.text="You are ${etage.toString().toInt()},the same age as Ariana Grande a singer song writer that came up @ the young age of 19 and has won awards for her music"
            }else {
                result.text="You age is in valid please enter an age between 20-30"
            }
            //CODE ATTRIBUTION
            //This method was taken from stackoverflow
            //https://stackoverflow.com/search?q=if&s=f45ecc79-0a29-4c77-bca5-609af87a5a7e
            //Mysticial
            //https://stackoverflow.com/users/922184/mysticial
        }
    }
}