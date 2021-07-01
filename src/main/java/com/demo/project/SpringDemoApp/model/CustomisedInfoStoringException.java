package com.demo.project.SpringDemoApp.model;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class CustomisedInfoStoringException extends RuntimeException {
    public CustomisedInfoStoringException() {super();}

    private ZonedDateTime dateTime;

    public CustomisedInfoStoringException(final String message, ZonedDateTime time) {
        super(message);
        this.dateTime = time;
    }

    public CustomisedInfoStoringException(String message) {
        super(message);
    }
}
