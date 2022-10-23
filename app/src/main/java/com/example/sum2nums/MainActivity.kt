package com.example.sum2nums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btResult);
        val edtxt1: EditText = findViewById(R.id.edNum1);
        val edtxt2: EditText = findViewById(R.id.edNum2);
        val resultTV: TextView = findViewById(R.id.textResult);
        button.setOnClickListener{ view ->
            // reading what in edText1, edText2, notice that you read it as text, //text can be converted to “toString” then can be converted to “toInt”
            var x: Int = edtxt1.text.toString().toInt();
            var y: Int = edtxt2.text.toString().toInt();
            //sum retun int, it needs to be changed to “toString” before assign it to //the text attribute of the EditView
            resultTV.text = sum(x,y).toString();
        }



    }
}

public fun sum(a: Int, b: Int): Int {
    return a+b;
}
