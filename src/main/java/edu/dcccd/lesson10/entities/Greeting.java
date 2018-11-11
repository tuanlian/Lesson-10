package edu.dcccd.lesson10.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@AllArgsConstructor
public class Greeting {
    public Greeting(String format) {

    }

    private String greeting() {
        return "greeting";
    }

    public void getGreeting() {

    }
}


