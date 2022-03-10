package com.company;

public class Catalogue {

    private Item[] items;
    private int counter;

    //Constructer.
    public Catalogue(int size){
        items = new Item[size];
    }

    public void addItem(Item i) {
        items[counter++] = i;
    }

    public Item[] getFullList() {
        return items;
    }

    public Item[] getAvailableItems() {
        return items;

    }

    public Item borrowItem(Item borrowedItem) {
        borrowedItem.makeUnavailable();
        return borrowedItem;

    }

    public Item findItem(String searchName) {
        for(int i = 0; i < items.length; i++) {
            Item foundItem = items[i];
            if (foundItem != null && foundItem.getDescription().equals(searchName)) {
                return foundItem;
            }
        }
        return null;
    }

    public Item returnItem(Item returnedItem) {
        returnedItem.makeAvailable();
        return returnedItem;

    }



}
