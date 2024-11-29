package com.prova.LuccaEmissorMicroservico.controller;

import com.prova.LuccaEmissorMicroservico.service.ParticipantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class ParticipantesController {

    @Autowired
    private ParticipantesService messageService;

    @PostMapping
    public String sendMessage(@RequestParam String message) {
        messageService.sendMessage(message);
        return "Message sent to RabbitMQ: " + message;
    }
}