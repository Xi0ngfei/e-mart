package com.ibm.emart.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTION")
public class TransactionEntity {
private Integer id;
private Integer userId;
private Integer sellerId;
private String tranType;
private Date tranDate;
  @Id
  @GeneratedValue
  @Column(name="TRAN_ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  @Column(name="USER_ID")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  @Column(name="SELLER_ID")
  public Integer getSellerId() {
    return sellerId;
  }

  public void setSellerId(Integer sellerId) {
    this.sellerId = sellerId;
  }
  @Column(name="TRAN_TYPE")
  public String getTranType() {
    return tranType;
  }

  public void setTranType(String tranType) {
    this.tranType = tranType;
  }
  @Column(name="TRAN_DATE")
  public Date getTranDate() {
    return tranDate;
  }

  public void setTranDate(Date tranDate) {
    this.tranDate = tranDate;
  }
}
