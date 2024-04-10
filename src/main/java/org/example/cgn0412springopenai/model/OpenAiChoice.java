package org.example.cgn0412springopenai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {
 *     "id": "chatcmpl-abc123",
 *     "choices": [
 *         {
 *             "message": {
 *                 "role": "assistant",
 *                 "content": "\n\nThis is a test!"
 *             },
 *         }
 *     ]
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenAiChoice {

    private OpenAiMessage message;


}
