package com.example.foodorderapp.Models;

public class OrdersModel {

    int OrderImage;
    String SoldItemName,price,orderNumber;

    public OrdersModel() {

    }


    public OrdersModel(int orderImage, String soldItemName, String price, String orderNumber) {
        this.OrderImage = orderImage;
        this.SoldItemName = soldItemName;
        this.price = price;
        this.orderNumber = orderNumber;
    }




    public int getOrderImage() {
        return OrderImage;
    }

    public void setOrderImage(int orderImage) {
        OrderImage = orderImage;
    }

    public String getSoldItemName() {
        return SoldItemName;
    }

    public void setSoldItemName(String soldItemName) {
        SoldItemName = soldItemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrdeerNumber(String ordeerNumber) {
        this.orderNumber = ordeerNumber;
    }
}
