package com.project.chatapp.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class EntitySearch {
    private String attribute;

    private String value;

    private String operator;

    private boolean isField;

}
