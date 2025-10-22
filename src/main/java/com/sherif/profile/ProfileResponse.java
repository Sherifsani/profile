package com.sherif.profile;

import java.time.LocalDateTime;

public class ProfileResponse {
    private String status;
    private Profile user;
    private LocalDateTime timestamp;
    private String fact;

    public ProfileResponse(String status, Profile user, LocalDateTime timestamp, String fact) {
        this.status = status;
        this.user = user;
        this.timestamp = timestamp;
        this.fact = fact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Profile getUser() {
        return user;
    }

    public void setUser(Profile user) {
        this.user = user;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
}
