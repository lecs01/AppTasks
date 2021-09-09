package br.com.lecs.apptasks.datasource

import br.com.lecs.apptasks.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

    fun getList() = list.toList()

    fun insertTask(task: Task){
        list.add(task.copy(id = list.size + 1))
    }
}