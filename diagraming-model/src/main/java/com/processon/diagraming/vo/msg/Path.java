package com.processon.diagraming.vo.msg;

import com.processon.diagraming.model.Action;
import lombok.Data;

import java.util.List;

@Data
public class Path {

    List<Action> actions;
}
