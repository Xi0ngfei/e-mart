package com.ibm.emart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class ItemEntity {
  private Integer itemId;
   private Integer categoryId;
   private String itemName;
   private String description;
   private float price;
   private Integer stockNum;
  @Id
  @GeneratedValue
  @Column(name="ITEM_ID")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }
  @Column(name="CATEGORY_ID")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }
  @Column(name="ITEM_NAME")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }
  @Column(name="DESCRIPTION")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  @Column(name="PRICE")
  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
  @Column(name="STOCK_NUM")
  public Integer getStockNum() {
    return stockNum;
  }

  public void setStockNum(Integer stockNum) {
    this.stockNum = stockNum;
  }
}
