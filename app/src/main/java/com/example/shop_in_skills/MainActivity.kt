package com.example.shop_in_skills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var auth : FirebaseAuth;
    lateinit var userEmail : TextView
    lateinit var userPass : TextView
    lateinit var binding : MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//         binding = MainActivity.
        auth = FirebaseAuth.getInstance()
        setContentView(R.layout.activity_main)
        userEmail = findViewById(R.id.userLoginEmail)
        userPass = findViewById(R.id.userLoginPass)
        val buttonSeller: Button =findViewById(R.id.sellerButton1)
        buttonSeller.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,sellerprofile::class.java)
            startActivity(intent)
            finishAffinity()
        })
        val buttonlogin: Button =findViewById(R.id.loginButton1)
        buttonlogin.setOnClickListener(View.OnClickListener {

            val Email = userEmail.text.toString().trim()
            val mPass = userPass.text.toString().trim()
            if (TextUtils.isEmpty(Email)){
               userEmail.setError("Required")
                return@OnClickListener;
            }
            if (TextUtils.isEmpty(mPass)){
                userEmail.setError("Required")
                return@OnClickListener;
            }


            firebaseLogin(Email , mPass)
//            val intent=Intent(this,page0::class.java)
//            startActivity(intent)
//            finishAffinity()
        })
    }

    private fun firebaseLogin(email: String, mPass: String) {
        Log.d("TAG", ": "+email)
        auth.signInWithEmailAndPassword(email , mPass).addOnCompleteListener {
            task->
            if (task.isSuccessful){
                Toast.makeText(this , "Login Success" , Toast.LENGTH_LONG).show()
                val intent=Intent(this,page0::class.java)
                startActivity(intent)
            }else{

                Toast.makeText(this , "Login Failed"+ task.exception.toString() , Toast.LENGTH_LONG).show()
            }
        }


    }
}