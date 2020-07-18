package com.base.samplebase.controller.entry;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrganizationEntry {
    private final String name;
    private final Date registrationDate;
    private final Date expiryDate;

    public OrganizationEntry(@JsonProperty("name") String name,
                             @JsonProperty("registrationDate") Date registrationDate,
                             @JsonProperty("expiryDate") Date expiryDate) {
        this.name = name;
        this.registrationDate = registrationDate;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "OrganizationEntry{" +
                ", name='" + name + '\'' +
                ", registrationDate=" + registrationDate +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
