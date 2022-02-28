package com.example.tablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addBtn: Button = findViewById<Button>(R.id.addBtn)
        val editTextVersion: EditText = findViewById<EditText>(R.id.editTextVersion)
        val editTextCode: EditText = findViewById<EditText>(R.id.editTextCode)
        val tableLayout: TableLayout = findViewById<TableLayout>(R.id.tableLayout)

        addBtn.setOnClickListener {
            val version: String = editTextVersion.text.toString().trim();
            val code: String = editTextCode.text.toString().trim();

            if (version.isNotEmpty() && code.isNotEmpty()){

                val newRow = TableRow(this)
                val newText1 = TextView(this)
                val newText2 = TextView(this)

                newText1.text = editTextVersion.text.toString()
                newRow.addView(newText1)
                newText2.text = editTextCode.text.toString()
                newRow.addView(newText2, 1)
                tableLayout.addView(newRow)

                editTextVersion.setText("")
                editTextCode.setText("")

                Toast.makeText(this, "New version added", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Please fill all the inputs first", Toast.LENGTH_SHORT).show()
            }
        }
    }
}