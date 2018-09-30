package com.processon.diagraming.model;


import lombok.Data;

@Data
public class FontStyle {
    private String  color ;
    private String   fontFamily;
    private boolean   bold;
    private boolean   italic;
    private Integer  size;


}
