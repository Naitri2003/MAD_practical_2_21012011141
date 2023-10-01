package com.naitri.mad_practical_2_21012011141

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Layout
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
 val a:ConstraintLayout=findViewById<ConstraintLayout?>(R.id.MainLayout)

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called!")


    }
        override fun onStart() {
        super.onStart()
        showMessage("onStart method is called!")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method is called!")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is called!")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is called!")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart method is called!")
    }
    fun showMessage(msg:String){
        Log.i(TAG, "$msg")
        Toast.makeText(this, "$msg", Toast.LENGTH_SHORT).show()

     Snackbar.make(findViewById(R.id.MainLayout),"$msg",Snackbar.LENGTH_LONG).show()
     if (a !=null){
            Snackbar.make(a, "$msg",Snackbar.LENGTH_LONG).show()
       }
    }
}