package org.example.shared;

public class HelloMessage {

    private String content;

    public HelloMessage() {
    }

    public HelloMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "HelloMessage{" +
                "content='" + content + '\'' +
                '}';
    }
}