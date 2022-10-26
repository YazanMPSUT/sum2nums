package com.example.sum2nums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text
import com.example.sum2nums.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btResult);
        val edtxt1: EditText = findViewById(R.id.edNum1);
        val edtxt2: EditText = findViewById(R.id.edNum2);
        val resultTV: TextView = findViewById(R.id.textResult);
        var flag : String = "sum";
        val spinner : Spinner = findViewById(R.id.spSelect);
        val options = arrayOf("sum","Multiply");
        spinner.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,options);

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2);
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        button.setOnClickListener{ view ->
            // reading what in edText1, edText2, notice that you read it as text, //text can be converted to “toString” then can be converted to “toInt”
            var x: Int = edtxt1.text.toString().toInt();
            var y: Int = edtxt2.text.toString().toInt();
            //sum retun int, it needs to be changed to “toString” before assign it to //the text attribute of the EditView
           if(flag == "sum")
            resultTV.text = sum(x,y).toString();
            else
               resultTV.text = multiply(x,y).toString();

        }



    }
}

public fun sum(a: Int, b: Int): Int {
    return a+b;
}

public fun multiply(a: Int, b: Int): Int {
    return a*b;
}
