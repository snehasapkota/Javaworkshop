package model;

public class SmartPhoneInventoryModel{
    private String modelcode;
    private int quantity;
    private String brand;
    private String color;
    private double price;
    private String modelname;

    //constructtor

    public SmartPhoneInventoryModel(String modelcode, int quantity, String brand, String color, double price, String modelname)
    {
        this.modelcode = modelcode;
        this.quantity = quantity;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.modelname = modelname;

    }
    //getter setter
    public String getModelCode(){
        return modelcode;
    }

    public void setModelCode(String modelcode) {
        this.modelcode = modelcode;
    }

    public int Quantity() {
        return quantity;
    }

    public void setQunatity(int quantity) {
        this.quantity = quantity;
    }
     public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

     public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     public String getModelName(){
        return modelname;
    }

    public void setModelName(String modelname) {
        this.modelname = modelname;
    }
    

