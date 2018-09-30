package com.processon.diagraming.vo.def;

import com.processon.diagraming.model.Page;
import com.processon.diagraming.vo.msg.Content;
import lombok.Data;


import java.util.Map;

@Data
public class Def {
    private Page page;
    private Map<String, Content> elements;
}
