package model;

Public class SmartPhoneInventoryModel{
    private string modelcode;
    private int quantity;
    private string brand;
    private string color;
    private double price;
    private string modelname;

    //constructtor

    public SmartPhoneInventoryModel(string modelcode, int quantity, string brand, string color, double price, string modelname)
    {
        this.modelcode = modelcode;
        this.quantity = quantity;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.modelname = modelname;

    }

    
}