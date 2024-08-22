package com.example.Timeappback.Response;

public class LoginResponse {
    String message;
       Boolean token;

    public LoginResponse(String message, Boolean token) {
        this.message = message;
        this.token = token;
    }

    public LoginResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getToken() {
        return token;
    }

    public void setToken(Boolean token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
            "message='" + message + '\'' +
            ", token=" + token +
            '}';
    }
}
