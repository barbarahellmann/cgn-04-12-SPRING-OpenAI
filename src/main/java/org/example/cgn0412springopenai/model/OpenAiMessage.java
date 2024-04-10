package org.example.cgn0412springopenai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 Objekt von ChatGPT:
 "messages": [
    {
        "role": "user",
        "content": "Say this is a test!"
    }
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenAiMessage {

    private String role;
    private String content;
    public OpenAiMessage(String question) {

        this.role = "user";
        this.content = question;
    }
}
