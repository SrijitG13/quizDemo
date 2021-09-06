package com.example.quizdemo;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin
@RequestMapping("/quiz")
public class MyController {
        @GetMapping("/quizlist")
        public quiz[] quizzes(){
            quiz[] arr = new quiz[5];
            String[] choice = {"1","2","3"};
            arr[0] = new quiz("1","What is java","Java is programming language",choice);
            arr[1] = new quiz("2","What is C","C is programming language",choice);
            arr[2] = new quiz("3","What is C++","C++ is programming language",choice);
            arr[3] = new quiz("4","What is Python","Python is programming language",choice);
            arr[4] = new quiz("5","What is R","R is programming language",choice);
            return arr;
        }
    
}
