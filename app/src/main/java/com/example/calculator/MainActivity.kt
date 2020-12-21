package com.example.calculator

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.calculator.adapter.MainAdapter
import com.example.calculator.model.SubjectModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var list = ArrayList<SubjectModel>
    private lateinit var mainAdapter : MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainAdapter = MainAdapter(list)
        recycler_view.adapter = mainAdapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        list.add(SubjectModel("English", 1, 1))
        list.add(SubjectModel("English", 1, 1))
        list.add(SubjectModel("English", 1, 1))
        list.add(SubjectModel("English", 1, 1))
        list.add(SubjectModel("English", 1, 1))
        list.add(SubjectModel("English", 1, 1))
        list.add(SubjectModel("English", 1, 1))
        list.add(SubjectModel("English", 1, 1))
        list.add(SubjectModel("English", 1, 1))

    }
}