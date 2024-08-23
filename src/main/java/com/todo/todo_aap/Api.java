package com.todo.todo_aap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Api {

    //dependency injection to get benBag object to store todos.
    @Autowired
    List<Todo> store;


    //add todo to todo arraylist
    @PostMapping("/add")
    public  String addTodo(@RequestBody Todo t){
       store.add(t);
       return "todo added";
    }


    //get all the todo from todo arraylist
    @GetMapping("/all-todo")
    public  List<Todo> todo(){
       return store;
    }



    //delete todo from todo arraylist
    @DeleteMapping("/delete/{todo_id}")
    public   String deleteTodo (@PathVariable Integer todo_id){
         for(Todo todo:store){
             if(todo.getTodo_id().equals(todo_id)){
                 int index = store.indexOf(todo);
                 store.remove(index);
                 return "Todo deleted successfully";
             }
         }
         return "failed to delete todo";
    }


    //update todo from todoArraylist
    @PutMapping("/update/{id}/{status}")
    public String Update(@PathVariable Integer id, @PathVariable  boolean status){
         for (Todo todo:store){
             if(todo.getTodo_id().equals(id)){
                 todo.setTodo_status(status);
                 return "todo status updated successfully";
             }
         }
        return "failed to update todo";
    }


}
