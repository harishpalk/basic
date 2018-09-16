package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class GeneratorImpl implements Generator {

    @Autowired
    private Generator generate;

    @Override
    public int generateInteger()
    {
        return generate.generateInteger();
    }

}
