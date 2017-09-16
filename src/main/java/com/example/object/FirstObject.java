package com.example.object;

import org.springframework.stereotype.Service;

@Service
public class FirstObject {

    private String foo;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "FirstObject{" +
                "foo='" + foo + '\'' +
                '}';
    }
}
