package com.processon.diagraming.vo.def;

import com.processon.diagraming.model.FillStyle;
import com.processon.diagraming.model.FontStyle;
import com.processon.diagraming.model.LineStyle;
import lombok.Data;

@Data
public class Shape {

    private LineStyle lineStyle;
    private FontStyle fontStyle;
    private FillStyle fillStyle;
}
