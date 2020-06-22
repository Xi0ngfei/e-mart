package com.ibm.emart.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="e_user")
public class eMartUserEntity {
  private Integer id;
  private String userName;
  private String password;
  private String email;
  private String mobileNum;
  private Date crtDate;

  public eMartUserEntity(Integer id, String userName, String password, String email,
      String mobileNum, Date crtDate) {
    this.id = id;
    this.userName = userName;
    this.password = password;
    this.email = email;
    this.mobileNum = mobileNum;
    this.crtDate = crtDate;
  }

  @Id
  @GeneratedValue
  @Column(name="ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  @Column(name="USER_NAME")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
  @Column(name="PASSWORD")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  @Column(name="EMAIL")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  @Column(name="MOBILE_NUM")
  public String getMobileNum() {
    return mobileNum;
  }

  public void setMobileNum(String mobileNum) {
    this.mobileNum = mobileNum;
  }
  @Column(name="CREATE_DATE")
  public Date getCrtDate() {
    return crtDate;
  }

  public void setCrtDate(Date crtDate) {
    this.crtDate = crtDate;
  }
}
