package com.example.shop_in_skills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlin.math.sign

class sellerprofile : AppCompatActivity() {
    lateinit var auth : FirebaseAuth
    lateinit var  firestore: FirebaseFirestore
    lateinit var collection : CollectionReference

    lateinit var signEmail : EditText
    lateinit var signName : EditText
    lateinit var signLast : EditText
    lateinit var signPsss: EditText
    lateinit var signPhone : EditText
    lateinit var signWeb : EditText
    lateinit var signNick : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
//        collection = firestore.collection("User")
        firestore = FirebaseFirestore.getInstance();
        Log.d("TAG", "onCreate: "+ (auth.currentUser?.uid ?: "NullString" ))
        setContentView(R.layout.activity_sellerprofile)
        signEmail = findViewById(R.id.signEmail)
        signName = findViewById(R.id.signName)
        signLast = findViewById(R.id.signLast)
        signPsss = findViewById(R.id.signPass)
        signWeb = findViewById(R.id.signWeb)
        signNick = findViewById(R.id.signNick)
        signWeb = findViewById(R.id.signWeb)
        signPhone = findViewById(R.id.signPhone)
        val buttonSubmit=findViewById<Button>(R.id.submit)
        buttonSubmit.setOnClickListener(View.OnClickListener {


            var mobile = signPhone.text.toString().trim()
            var signWeb = signWeb.text.toString().trim();
            var last = signLast.text.toString().trim()
            var name = signName.text.toString().trim()
            var nick = signNick.text.toString().trim();
            var mEmail = signEmail.text.toString().trim();
            var mPass = signPsss.text.toString().trim();
            if (TextUtils.isEmpty(name)){
                signName.setError("Required")
                return@OnClickListener
            }
            if (TextUtils.isEmpty(mEmail)){
                signName.setError("Required")
                return@OnClickListener
            }
            if (TextUtils.isEmpty(mPass)){
                signName.setError("Required")
                return@OnClickListener
            }

            signUpwithFirebase(mEmail , mPass , mobile , signWeb , last , name , nick)
//            val intent= Intent(this,page0::class.java)
//            startActivity(intent)
        })
    }

    private fun signUpwithFirebase(
        mEmail: String,
        mPass: String,
        mobile: String,
        signWeb: String,
        last: String,
        name: String,
        nick: String
    ) {
        auth.createUserWithEmailAndPassword(mEmail , mPass).addOnCompleteListener { task->
            if (task.isSuccessful){
                var hashMap : HashMap<String, String> = HashMap<String, String> ()
                hashMap.put("name" , name)
                hashMap.put("email" , mEmail)
                hashMap.put("last" , last)
                hashMap.put("web" , signWeb)
                hashMap.put("nick" , nick)
                hashMap.put("mobile" , mobile)
                firestore.collection("User").document(auth.currentUser?.uid.toString()).set(hashMap).addOnCompleteListener { task->
                    if (task.isSuccessful){
                        Toast.makeText(this , "SignUp Complete" , Toast.LENGTH_LONG).show()
                        val intent=Intent(this,page0::class.java)
                        startActivity(intent)
                    }else{

                        Toast.makeText(this , "SignUp Failed"+ task.exception.toString() , Toast.LENGTH_LONG).show()
                    }
                }
               //  Toast.makeText(this , "Login Success" , Toast.LENGTH_LONG).show()
            }else{

                Toast.makeText(this , "Login Failed"+ task.exception.toString() , Toast.LENGTH_LONG).show()
            }
        }
    }


}