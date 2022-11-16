package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun silnia(n: Int): Int
        {
            if (n>=1)
            {
                return n*silnia(n-1)
            }

            return 1
        }


        var a=1
        findViewById<Button>(R.id.przod).setOnClickListener{
            if (a==1)
            {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.kot)
                a=2
            }
            else {
                if (a==2)
                {
                    findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.piesek)
                    a=3
                }
                else{
                    if (a==3)
                    {
                        findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.pies)
                        a=1
                    }
                }
            }
        }

        findViewById<Button>(R.id.tyl).setOnClickListener{
            if (a==1)
            {
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.pies)
                a=2
            }
            else {
                if (a==2)
                {
                    findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.piesek)
                    a=3
                }
                else{
                    if (a==3)
                    {
                        findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.kot)
                        a=1
                    }
                }
            }
        }
        var liczba=0
        var text_liczba=findViewById<TextView>(R.id.textView2)
        var text_wynik=findViewById<TextView>(R.id.textView3)
        findViewById<Button>(R.id.wiecej).setOnClickListener{
            liczba +=1
            if(liczba>10)
            {
                liczba=10
            }
            text_liczba.text=liczba.toString()
        }

        findViewById<Button>(R.id.mniej).setOnClickListener{
            liczba -=1
            if(liczba<0)
            {
                liczba=0
            }
            text_liczba.text=liczba.toString()
        }
        findViewById<Button>(R.id.silnia).setOnClickListener {
            var wynik=silnia(liczba)
            text_wynik.text=wynik.toString()

        }
    }
}