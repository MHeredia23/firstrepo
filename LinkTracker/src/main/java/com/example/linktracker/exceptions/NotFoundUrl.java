package com.example.linktracker.exceptions;

public class NotFoundUrl extends Exception{

    public final String ERROR = "No existe url para dicho linkId";

    public NotFoundUrl() {
        super();
    }
}
