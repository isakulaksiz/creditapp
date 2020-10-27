package com.koc.creditapp.Client.CreditScore;

public class IdentityNoNotFoundException extends IllegalArgumentException{
    public final String message;

    private IdentityNoNotFoundException(String message){
        this.message= message;
    }

    public static IdentityNoNotFoundException create(String message) {
        return new IdentityNoNotFoundException(message);
    }

    @Override
    public String getMessage(){
        return "Credit score not found !"+message;
    }
}
