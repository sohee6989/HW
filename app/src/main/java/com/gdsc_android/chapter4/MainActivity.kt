package com.gdsc_android.chapter4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gdsc_android.chapter4.databinding.ActivityMainBinding
import android.content.Intent


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goInputActivityButton.setOnClickListener{
            val intent = Intent(this, InputActivity::class.java)
            intent.putExtra("intentMessage", "응급의료정보")
            startActivity(intent)
        }
    }
}