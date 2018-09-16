package com.test.business;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Generator {

    public int getInteger()
    {
        Random random=new Random();
        return random.nextInt();
    }
}
