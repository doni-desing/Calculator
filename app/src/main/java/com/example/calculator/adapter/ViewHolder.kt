package com.example.calculator.adapter

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.calculator.R
import com.example.calculator.model.SubjectModel

class ViewHolder(itemView: View, list: ArrayList<SubjectModel>) : RecyclerView.ViewHolder(itemView) {
    private var edSubject: EditText? = null
    private var tvSubject: TextView? = null
    private var tvReating: TextView? = null

    init {
        edSubject = itemView.findViewById(R.id.ed_subject)
        tvSubject = itemView.findViewById(R.id.tv_subject)
        tvReating = itemView.findViewById(R.id.tv_rating)
    }

    fun onBind(model: SubjectModel) {
        tvSubject?.text = model.subject
        tvReating?.text = model.score.toString()
    }

}