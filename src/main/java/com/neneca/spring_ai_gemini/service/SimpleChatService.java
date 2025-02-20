package com.neneca.spring_ai_gemini.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.Generation;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SimpleChatService {

    private final ChatClient chatClient;

    public SimpleChatService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }


    public List<Generation> chat(String message) {

        try{
            String responseText = this.chatClient.prompt()
                    .user(message)
                    .call()
                    .content();


            AssistantMessage assistantMessage = new AssistantMessage(responseText);
            Generation generation = new Generation(assistantMessage);

            return Collections.singletonList(generation);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao processar solicitação", e);
        }

    }
}
