package org.example;

import org.springframework.stereotype.Service;

@Service("B")
public class B implements Message{
    @Override
    public void sending(String message) {
        System.out.println("This is B class sending"+message);

    }
}
