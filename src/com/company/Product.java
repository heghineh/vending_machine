package com.company;

public abstract class Product {


    //region Properties
    private String name;
    //endregion

    //region Constructors
    public Product(String name) {
        this.name = name;
    }
    //endregion

    //region Public Methods

    //endregion

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}
