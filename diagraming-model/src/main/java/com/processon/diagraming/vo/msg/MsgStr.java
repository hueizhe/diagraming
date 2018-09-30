package com.processon.diagraming.vo.msg;

import com.processon.diagraming.vo.msg.Message;
import lombok.Data;

import java.util.List;

@Data
public class MsgStr {

    private String action;
    private List<Message> messages;
    private String name;
}
