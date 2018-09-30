package com.processon.diagraming.model;

import lombok.Data;

@Data
public class Page {

    private String backgroundColor;
    private String orientation;
    private Integer  width ;
    private Integer  height ;
    private Integer  padding ;
    private Integer  gridSize ;
    private boolean  showGrid;

}
