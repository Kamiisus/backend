package com.kxikw.develop.gable.model;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Storepro")
public class Product {
   
    String store_id;
    String store_name;
    String branch;
    String type;
    String qty;
    String price;

    public Product() {
    }

    public Product(String store_name, String branch, String type, String qty,String price) {
        this.store_name = store_name;
        this.branch = branch;
        this.type = type;
        this.qty = qty;
        this.price = price;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}