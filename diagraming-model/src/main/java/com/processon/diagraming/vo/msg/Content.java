package com.processon.diagraming.vo.msg;

import com.processon.diagraming.model.*;
import lombok.Data;

import java.util.List;

@Data
public class Content {
    private String   id;
    private String   name;
    private String   title;
    private String   category;
    private String   group;
    private String   groupName;
    private boolean  locked;
    private String   link;
    private List children;
    private String parent;
    private List resizeDir;

    private Attribute attribute;

    private List<DataAttribute>  dataAttributes;

    private Props props;

    private ShapeStyle shapeStyle;

    private LineStyle lineStyle;

    private FillStyle fillStyle;

    private Path path;

    private FontStyle fontStyle;

    private TextBlock textBlock;

    private List<Anchor> anchors;

}
