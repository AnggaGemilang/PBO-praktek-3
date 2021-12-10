/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.angga.tugas12;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 * @author angga
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"code",
"description"
})
public class Status {

    @JsonProperty("code")
    private Integer code;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

}