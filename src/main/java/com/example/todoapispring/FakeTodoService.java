package com.example.todoapispring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//To make TodoController depend on interface rather than concrete classes we did create a TodoService interface
//implemented it using FakeTodoService class and then passed the reference of FakeTodoService interface to TodoControler
//Dependency invesion principle to implement dependency injection
//Everything is automatically figured out by spring
@Service("fakeTodoService")
public class FakeTodoService implements TodoService{

    @TimeMonitor
    @Override
    public String doSomething() {
        for(long i = 0; i < 10000000000L; i++) {}
        return "Something";
    } // join point

}
