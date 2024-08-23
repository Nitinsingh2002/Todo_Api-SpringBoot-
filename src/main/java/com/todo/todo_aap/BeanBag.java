package com.todo.todo_aap;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanBag {

    //creating datasource to store todo.
    @Bean
    public List<Todo> createArrayList (){
        return  new ArrayList<Todo>();
    }

}
