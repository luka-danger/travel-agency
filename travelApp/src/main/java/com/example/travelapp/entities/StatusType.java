package com.example.travelapp.entities;

public enum StatusType {
    PENDING("pending"),
    ORDERED("ordered"),
    Canceled("canceled");

    private final String displayStatus;

    StatusType(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }
}
