package com.processon.diagraming.vo.msg;

import lombok.Data;

@Data
public class Attribute {
    private boolean  container;

    private boolean  visible;

    private boolean  rotatable;

    private boolean  linkable;

    private boolean  collapsable;

    private boolean  collapsed;

    private Integer markerOffset;
}
