package org.example;

import org.springframework.stereotype.Service;

@Service("C")
public class C implements Message{
    @Override
    public void sending(String message) {

        System.out.println("This is C class sending "+message);
    }
}
