package com.example.resgistrationform

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.resgistrationform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun submitData(view : View){
        val email = binding.emailInput.text
        val fulllname = binding.fullnameInput.text
        val username = binding.usernameInput.text
        val pass = binding.passwordInput.text
        Toast.makeText(this, "$email, $fulllname, $username, $pass", Toast.LENGTH_LONG).show()
    }

}