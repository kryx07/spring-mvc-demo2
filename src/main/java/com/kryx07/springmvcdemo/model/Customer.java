package com.kryx07.springmvcdemo.model;

import org.springframework.beans.factory.annotation.Required;

import javax.validation.constraints.*;

public class Customer {


    private String firstName;

    @Size(min = 3, message = "is required")
    //@Length(min = 5,max = 6)
    //@NotEmpty
    //@Min(5)
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0,message = "min 0")
    @Max(value = 10,message = "max 10")
    private Integer freePasses;

    //@Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only 5 chars/digits")
//    @Pattern(regexp = "^[[0-9]{5}]|[[0-9]{2}\\-[0-9]{3}]$",message = "only 5 chars/digits")
    @Pattern(regexp = "^[0-9]{2}-[0-9]{3}$",message = "only 5 chars/digits")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
