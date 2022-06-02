package com.javaoo.Flowers;

public abstract class BouquetItem {

    public BouquetItem(){
    }

    public BouquetItem(Double price){
        this.setPrice(price);
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;
}
