package com.processon.diagraming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/diagraming")
public class DiagramingController {


    /**
     *
     * @param subject
     * @param client
     * @param uk
     */
    @GetMapping("/poll")
    public void poll(String subject, String client, String uk){

    }


    @PostMapping("/msg")
    public void msg(){

    }


    @PostMapping("/add_version")
    public void add_version(){

    }

}