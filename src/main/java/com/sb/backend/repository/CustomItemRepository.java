package com.sb.backend.repository;

public interface CustomItemRepository {

    void updateItemQuantity(String itemName, float newQuantity);

}