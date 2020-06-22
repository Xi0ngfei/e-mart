package com.ibm.emart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity {
  private Integer categoryId;
  private String categoryName;
  private String briefDetails;
  @Id
  @GeneratedValue
  @Column(name="CATEGORY_ID")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }
  @Column(name="CATEGORY_NAME")
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
  @Column(name="BRIEF_DETAILS")
  public String getBriefDetails() {
    return briefDetails;
  }

  public void setBriefDetails(String briefDetails) {
    this.briefDetails = briefDetails;
  }
}
