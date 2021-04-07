package com.example;

import javax.ejb.Stateless;

@Stateless
public class MessageEjb {

    public String getMessage() throws Exception {
        return "Hello from " + MessageEjb.class;
    }

}
