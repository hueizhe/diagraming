package com.processon.diagraming.model;

import com.processon.diagraming.vo.msg.Message;
import lombok.Data;

import java.util.List;

@Data
public class MsgStr {

    private String action;
    private List<Message> messages;
    private String name;
}
