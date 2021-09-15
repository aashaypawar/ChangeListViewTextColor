package org.geeksforgeeks.changelistviewtextcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mItems: Array<String> = arrayOf("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Zero")
        val mListView = findViewById<ListView>(R.id.list_view)
        val mAdapter = ArrayAdapter<String>(this, R.layout.list_item, R.id.text_view, mItems)
        mListView.adapter = mAdapter
    }
}