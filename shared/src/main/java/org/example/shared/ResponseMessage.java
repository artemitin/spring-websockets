package org.example.shared;

public class ResponseMessage {

    private String response;

    public ResponseMessage() {
    }

    public ResponseMessage(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}