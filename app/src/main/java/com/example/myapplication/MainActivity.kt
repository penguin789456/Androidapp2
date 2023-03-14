package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    private var allCont:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.titletext.text="123"
        binding.myPhoneNum.text="0908688512"

        binding.imageView4.setOnTouchListener(pItem)
        binding.imageView5.setOnTouchListener(pItem)

        binding.ButUniverse1.setOnClickListener {
            allCont++
            binding.showText.text=getString(R.string.myuniver1)+allCont
        }

        binding.ButUniverse2.setOnClickListener {
            binding.showText.text=binding.text3.text.toString()+allCont.toString()
        }
    }

    private val pItem=object : View.OnTouchListener{
        override fun onTouch(v: View?, p1: MotionEvent?): Boolean {
            binding.showText.text="id:"+v?.id
            if(v?.id==R.id.imageView4){
                Toast.makeText(this@MainActivity,R.string.myuniver1,Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this@MainActivity,R.string.myuniver2,Toast.LENGTH_SHORT).show()
            }
            return true
        }
    }
}