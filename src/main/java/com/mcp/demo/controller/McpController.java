package com.mcp.demo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.client.advisor.ToolCallAdvisor;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class McpController {

    private ChatClient chatClient;

    public McpController(ChatClient.Builder chatClientBuilder, ToolCallbackProvider toolCallbackProvider) {
            this.chatClient = chatClientBuilder
                    .defaultToolCallbacks(toolCallbackProvider)
                    .defaultAdvisors(new SimpleLoggerAdvisor())
                    .build();
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String query){
        return chatClient.prompt(query).call().content();
    }


}
