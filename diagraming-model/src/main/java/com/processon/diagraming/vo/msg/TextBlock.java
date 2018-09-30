package com.processon.diagraming.vo.msg;

import com.processon.diagraming.model.Position;
import lombok.Data;

@Data
public class TextBlock {

    private Position position;

    private String text;

}
