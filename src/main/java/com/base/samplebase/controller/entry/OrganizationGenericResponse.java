package com.base.samplebase.controller.entry;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrganizationGenericResponse {

    private final boolean ok = true;
    private final OperationResult result;

    @JsonCreator
    public OrganizationGenericResponse(@JsonProperty("result") OperationResult result) {
        this.result = result;
    }

    public boolean isOk() {
        return ok;
    }

    public OperationResult getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "GenericOperationResult{" +
                "ok=" + ok +
                ", result=" + result +
                '}';
    }
}
