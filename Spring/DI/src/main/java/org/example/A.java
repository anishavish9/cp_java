package org.example;

import org.springframework.stereotype.Service;

@Service("A")
public class A implements Message{
    @Override
    public void sending(String message) {

        System.out.println("This is A class sending "+message);
    }
}
