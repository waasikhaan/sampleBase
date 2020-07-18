package com.base.samplebase.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Organization {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID id;
  private String name;
  private Date registrationDate;
  private Date expiryDate;

  public Organization(String name, Date registrationDate, Date expiryDate) {
    this.name = name;
    this.registrationDate = registrationDate;
    this.expiryDate = expiryDate;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Date getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(java.sql.Timestamp registrationDate) {
    this.registrationDate = registrationDate;
  }


  public Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(java.sql.Timestamp expiryDate) {
    this.expiryDate = expiryDate;
  }

}
