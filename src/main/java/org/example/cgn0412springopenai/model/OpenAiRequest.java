package org.example.cgn0412springopenai.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
Objekt von ChatGPT:
{
    "model": "gpt-3.5-turbo",
        "messages": [
            {
            "role": "user",
            "content": "Say this is a test!"
        }
    ]
}'

 */



@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenAiRequest {

    private String model;
    private List<OpenAiMessage> messages;
    public OpenAiRequest(String question){
        this.model = "gpt-3.5-turbo";
        this.messages = List.of(new OpenAiMessage(question));
    }
}
