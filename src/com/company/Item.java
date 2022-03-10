package com.company;

public class Item {
    private String category;
    private String description;
    private boolean isAvailable;

    public Item (String category, String description){
    this.category = category;
    this.description = description;
    isAvailable = true;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void makeUnavailable() {
        isAvailable = false;
    }

    public void makeAvailable() {
        isAvailable = true;
    }


    //@Override
    public String toString (){
        return "Item category: " + category + "\n"
                + "Description: " + description + "\n"
                + " Available: " + isAvailable;
    }
}
