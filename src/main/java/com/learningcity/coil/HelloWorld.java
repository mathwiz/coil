package com.learningcity.coil;

/**
 * Created with IntelliJ IDEA.
 * User: Yohan
 * Date: 6/27/13
 * Time: 9:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return "Hello " + name;
    }
}
