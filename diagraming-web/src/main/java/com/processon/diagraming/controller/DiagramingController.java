package com.processon.diagraming.controller;

import com.processon.diagraming.vo.def.AddVersion;
import com.processon.diagraming.vo.msg.Msg;
import com.processon.diagraming.vo.msg.MsgStr;
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
    public void msg(Msg msg){

    }


    @PostMapping("/add_version")
    public void add_version(AddVersion addVersion){

    }




}