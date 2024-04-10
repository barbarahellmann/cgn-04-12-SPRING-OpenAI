package org.example.cgn0412springopenai.service;


import org.example.cgn0412springopenai.model.OpenAiRepsonse;
import org.example.cgn0412springopenai.model.OpenAiRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.beans.factory.annotation.Value;

@Service
public class OpenAIService {

    private final RestClient client;

    public OpenAIService(
            @Value("${API_KEY}") String apiKey,
            @Value("${BASE_URL}") String baseUrl
    ) {
      client = RestClient.builder()
              .baseUrl(baseUrl)
              .defaultHeader("Authorization", "Bearer "+apiKey)
              .build();

    }
    public String askQuestion(String q) {
        OpenAiRequest request = new OpenAiRequest(q);
        return client.post()
                .body(request)
                .retrieve()
                .body(OpenAiRepsonse.class)
                .getAnswer();

    }
}
