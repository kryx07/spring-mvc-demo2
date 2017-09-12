package com.kryx07.springmvcdemo.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Customer {


    private String firstName;

    @Size(min = 3, message = "is required")
    //@Length(min = 5,max = 6)
    //@NotEmpty
    //@Min(5)
    private String lastName;

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
