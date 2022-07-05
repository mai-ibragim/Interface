package com.company;

public class Main {

    public static void main(String[] args) {
       Swimable[] oceanarium = {new Duck(), new Shark(), new Turtle(),
               new Duck(), new Shark(), new Turtle(),
               new Duck(), new Shark(), new Turtle(),
               new Duck(), new Shark(), new Turtle(),
               new Duck(), new Shark(), new Turtle()};


        for (Swimable result: oceanarium) {
            result.method();
        }
    }
}
