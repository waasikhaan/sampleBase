package com.base.samplebase.controller;

import com.base.samplebase.controller.entry.OperationResult;
import com.base.samplebase.controller.entry.OrganizationEntry;
import com.base.samplebase.controller.entry.OrganizationGenericResponse;
import com.base.samplebase.data.entity.Organization;
import com.base.samplebase.data.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/server/organization")
public class OrganizationController {
    @Autowired
    private OrganizationRepository repository;

    @PostMapping
    public OrganizationGenericResponse insert (@RequestBody OrganizationEntry entry) {
        Organization organization = entryToEntity(entry);
        repository.save(organization);
        return new OrganizationGenericResponse(OperationResult.CREATED);
    }

    private Organization entryToEntity(OrganizationEntry entry) {
        return new Organization(entry.getName(), entry.getRegistrationDate(), entry.getExpiryDate());
    }


}
