package com.apps.nb2998.todoappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.apps.nb2998.todoappkotlin.Adapters.TodoAdapter
import com.apps.nb2998.todoappkotlin.Models.Todo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val todos : ArrayList<Todo> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTodo.layoutManager = LinearLayoutManager(this)
        val todoAdapter = TodoAdapter(todos)
        rvTodo.adapter = todoAdapter

        btnAdd.setOnClickListener({
            todos.add(Todo(etTodoName.text.toString(), false))
            todoAdapter.notifyDataSetChanged()
            etTodoName.text.clear()
        })
    }
}
