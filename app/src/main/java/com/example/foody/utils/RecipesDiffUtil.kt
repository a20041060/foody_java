package com.example.foody.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.foody.models.Result

class RecipesDiffUtil(
    private val oldList: List<Result>,
    private val newlist: List<Result>
):DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newlist.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newlist[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newlist[newItemPosition]
    }

}