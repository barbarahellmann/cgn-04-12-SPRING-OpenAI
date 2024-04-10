package org.example.cgn0412springopenai.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * {
 *     "id": "chatcmpl-abc123",
 *     "choices": [
 *         {
 *             index": 0
 *             "message": {
 *                 "role": "assistant",
 *                 "content": "\n\nThis is a test!"
 *             },
 *             "logprobs": null,
 *             "finish_reason": "stop",
 *         }
 *     ]
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenAiRepsonse {

    private String id;
    private List<OpenAiChoice> choices;

    public String getAnswer(){
        return getChoices()
                .get(0)
                .getMessage()
                .getContent();
    }
}
