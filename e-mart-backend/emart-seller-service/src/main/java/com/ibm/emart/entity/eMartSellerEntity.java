package com.ibm.emart.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "e_seller")
public class eMartSellerEntity {

  private Integer id;
  private String userName;
  private String password;
  private String companyName;
  private String companyDesc;
  private String postalAddress;
  private String website;
  private String email;
  private String contactNum;
  private Date crtDate;

  @Id
  @GeneratedValue
  @Column(name = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "USER_NAME")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Column(name = "PASSWORD")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Column(name = "COMPANY_NAME")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  @Column(name = "COMPANY_DESC")
  public String getCompanyDesc() {
    return companyDesc;
  }

  public void setCompanyDesc(String companyDesc) {
    this.companyDesc = companyDesc;
  }

  @Column(name = "POSTAL_ADDRESS")
  public String getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(String postalAddress) {
    this.postalAddress = postalAddress;
  }

  @Column(name = "WEBSITE")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  @Column(name = "EMAIL")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "CONTACT_NUM")
  public String getContactNum() {
    return contactNum;
  }

  public void setContactNum(String contactNum) {
    this.contactNum = contactNum;
  }

  @Column(name = "CREATE_DATE")
  public Date getCrtDate() {
    return crtDate;
  }

  public void setCrtDate(Date crtDate) {
    this.crtDate = crtDate;
  }
}
