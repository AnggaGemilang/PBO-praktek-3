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
"service",
"value"
})
public class ServicePackage {

    @JsonProperty("service")
    private String service;
    
    @JsonProperty("value")
    private Integer value;
    
    @JsonProperty("service")
    public String getService() {
        return service;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

}