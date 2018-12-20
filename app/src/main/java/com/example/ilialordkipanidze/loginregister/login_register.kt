package com.example.ilialordkipanidze.loginregister

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class login_register : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)
        auth = FirebaseAuth.getInstance()
        init()

    }
    private fun init(){
        var signInPage=Intent(this,login_register::class.java)
        var SignUpPage=Intent(this,signup::class.java)

        SignInActivityButton.setOnClickListener{
            startActivity(signInPage)
        }
        signUpActivityButton.setOnClickListener{
            startActivity(signUpPage)
        }
    }
}
