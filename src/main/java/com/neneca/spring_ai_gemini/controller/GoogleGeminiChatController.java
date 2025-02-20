package com.neneca.spring_ai_gemini.controller;

import com.neneca.spring_ai_gemini.service.SimpleChatService;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/google-gemini")
public class GoogleGeminiChatController {

    private final SimpleChatService simpleChatService;

    public GoogleGeminiChatController(SimpleChatService simpleChatService) {
        this.simpleChatService = simpleChatService;
    }

    @PostMapping("/chat")
    public ChatResponse chat(@RequestBody String message) {
        return new ChatResponse(this.simpleChatService.chat(message));
    }

}
