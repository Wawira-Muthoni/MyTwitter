package dev.christine.twitterreplica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.christine.twitterreplica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTwitter()
    }
    fun displayTwitter(){
        var twitter = Twitter("Mitchell","@mit","I love coding","","","","","")
        var twitter1 = Twitter("Jon","@jon","I love travelling","","","","","")
        var twitter2 = Twitter("Cheko","@cheko","I love watching","","","","","")
        var twitter3 = Twitter("Dennis","@den","I love reading","","","","","")
        var twitter4 = Twitter("Justa","@justa","I love helping","","","","","")
        var twitter5 = Twitter("Ivy","@ivy","I love laughing","","","","","")
        var twitter6= Twitter("Isaac","@isaac","I love dancing","","","","","")
        var twitter7 = Twitter("Imelda","@im","I am hardworking","","","","","")
        var twitter8 = Twitter("Kelvin","@kel","I like partying","","","","","")
        var twitter9 = Twitter("James","@jm","I love Python","","","","","")
        var twitter10 = Twitter("Mark","@mrk","I love travelling","","","","","")
        var twitter11 = Twitter("Joanna","@jn","I love doing makeup","","","","","")
        var twitter12 = Twitter("Abigael","@ab","I love eating","","","","","")
        var twitter13 = Twitter("Ohesto","@oh","I love cooking","","","","","")




        var twitterList= listOf(twitter,twitter2,twitter3,twitter4,twitter5,twitter6,twitter7,twitter8,twitter9,twitter10,twitter11,twitter12,twitter13)
        var twitterAdapter = TwitterRvAdapter(twitterList)
        binding.rvTwitter.layoutManager = LinearLayoutManager(this)
        binding.rvTwitter.adapter = twitterAdapter


    }



}