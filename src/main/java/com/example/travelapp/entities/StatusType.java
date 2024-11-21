package com.example.travelapp.entities;

public enum StatusType {
    pending("pending"),
    ordered("ordered"),
    canceled("canceled");

    private final String displayStatus;

    StatusType(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }
}
