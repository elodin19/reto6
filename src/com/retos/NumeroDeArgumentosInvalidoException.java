package com.retos;

public class NumeroDeArgumentosInvalidoException extends Exception{

    public NumeroDeArgumentosInvalidoException(){
        super();
    }

    public NumeroDeArgumentosInvalidoException(String message){
        super(message);
    }
}
