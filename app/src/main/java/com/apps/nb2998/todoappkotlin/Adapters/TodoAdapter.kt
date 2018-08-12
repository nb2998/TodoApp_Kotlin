package com.apps.nb2998.todoappkotlin.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import com.apps.nb2998.todoappkotlin.Models.Todo
import com.apps.nb2998.todoappkotlin.R

class TodoAdapter (val todos: ArrayList<Todo>): RecyclerView.Adapter<TodoAdapter.TodoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoHolder {
        val li :LayoutInflater= parent?.context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = li.inflate(R.layout.single_row, parent, false)
        return TodoHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoHolder, position: Int) {
        holder?.tvTodo?.text = todos[position].name
    }

    class TodoHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val tvTodo = view.findViewById<TextView?>(R.id.tvTodo)
    }
}