package com.javalambdas.lambdas;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        Greeting lambdaGreeting = () -> System.out.println("Hello world!");
        lambdaGreeting.perform();




        //Greeting addFunction = (int a, int b) -> a + b;


    }
}
