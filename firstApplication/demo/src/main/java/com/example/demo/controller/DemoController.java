package com.example.demo.controller;
import com.example.demo.dto.UserDetails;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1")
public class DemoController  {

    @GetMapping("/demo")
    public @ResponseBody String getDemoDetails() {
        UserDetails userDetails = new UserDetails(HttpStatus.ACCEPTED.toString(), 10,"Mukesh");
        int age = userDetails.age();
        System.out.println(age);
        String str = "Hello World";
       // return new ResponseEntity<>(userDetails, HttpStatus.ACCEPTED);
        return  str;
    }
}
