package com.todo.todo_aap;



public class Todo {
    private Integer Todo_id;
    private String Todo_title;
    private  String Todo_description;
    private  Boolean Todo_status;

    public Integer getTodo_id() {
        return Todo_id;
    }

    public void setTodo_id(Integer todo_id) {
        Todo_id = todo_id;
    }

    public String getTodo_title() {
        return Todo_title;
    }

    public void setTodo_title(String todo_title) {
        Todo_title = todo_title;
    }

    public String getTodo_description() {
        return Todo_description;
    }

    public void setTodo_description(String todo_description) {
        Todo_description = todo_description;
    }

    public Boolean getTodo_status() {
        return Todo_status;
    }

    public void setTodo_status(Boolean todo_status) {
        Todo_status = todo_status;
    }

    public Todo(Integer todo_id, String todo_title, String todo_description, Boolean todo_status) {
        Todo_id = todo_id;
        Todo_title = todo_title;
        Todo_description = todo_description;
        Todo_status = todo_status;
    }
}
