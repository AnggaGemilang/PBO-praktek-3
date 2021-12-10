/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angga.tugas12;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author angga
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"status",
"servicePackage",
"city",
"weight",
"quantity",
"priceItem",
"productName"
})
public class Pesanan {

    @JsonProperty("status")
    private Status status;
    
    @JsonProperty("servicePackage")
    private ServicePackage servicePackage;
    
    @JsonProperty("city")
    private City city;
    
    @JsonProperty("weight")
    private Integer weight;
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    @JsonProperty("priceItem")
    private Integer priceItem;
    
    @JsonProperty("productName")
    private String productName;
    
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("servicePackage")
    public ServicePackage getServicePackage() {
        return servicePackage;
    }

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("priceItem")
    public Integer getPriceItem() {
        return priceItem;
    }

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }
    
    @Override
    public String toString(){
        String output = '|' + StringUtils.center(getProductName(), 23, ' ') 
            + '|' + StringUtils.center(getQuantity().toString(), 10, ' ') 
            + '|' + StringUtils.center(getWeight().toString(), 10, ' ') 
            + '|' + StringUtils.center(getCity().getDestination(), 15, ' ') 
            + '|' + StringUtils.center(getServicePackage().getService(), 26, ' ')
            + '|' + StringUtils.center(getServicePackage().getValue().toString(), 9, ' ')
            + '|' + StringUtils.center(getPriceItem().toString(), 9, ' ') + '|';
        return output;
    }
    
}