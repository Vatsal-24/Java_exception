package org.vatsal;

public class ExceptionService {

    public void exceptionServiceMethod(){
        System.out.println("Inside service");
        throw new RuntimeException("exception from service");
    }
}
