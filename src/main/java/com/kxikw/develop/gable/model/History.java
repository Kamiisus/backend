package com.kxikw.develop.gable.model;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "History")
public class History {
   
    String history_id;
    String history_name;
    String branch;
    String type;
    String qty;
    String price;

    public History() {
    }

    public History(String history_name, String branch, String type, String qty,String price) {
        this.history_name = history_name;
        this.branch = branch;
        this.type = type;
        this.qty = qty;
        this.price = price;
    }

    public String getStore_id() {
        return history_id;
    }

    public void setStore_id(String history_id) {
        this.history_id = history_id;
    }

    public String getStore_name() {
        return history_name;
    }

    public void setStore_name(String history_name) {
        this.history_name = history_name;
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