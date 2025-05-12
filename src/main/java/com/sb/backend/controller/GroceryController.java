package com.sb.backend.controller;


import com.sb.backend.model.GroceryItem;
import com.sb.backend.repository.CustomItemRepository;
import com.sb.backend.repository.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/grocery")

public class GroceryController {

    Logger logger = LoggerFactory.getLogger(GroceryController.class);


    @Autowired
    ItemRepository groceryItemRepo;

    @Autowired
    CustomItemRepository customRepo;

    @GetMapping("all")
    public List<GroceryItem> showAllGroceryItems() {
        List<GroceryItem> itemList;

        itemList = groceryItemRepo.findAll();

        itemList.forEach(item -> System.out.println(getItemDetails(item)));
        return itemList;

    }

    @PostMapping("update")
    public void updateItemQuantity(String name, float newQuantity) {
        System.out.println("Updating quantity for " + name);
        customRepo.updateItemQuantity(name, newQuantity);
    }

    //READ
    private String getItemDetails(GroceryItem item) {

        System.out.println(
                "Item Name: " + item.getName() +
                        ", \nItem Quantity: " + item.getItemQuantity() +
                        ", \nItem Category: " + item.getCategory()
        );

        return "";
    }


    //CREATE
    private void createGroceryItems() {
        System.out.println("Data creation started...");

        groceryItemRepo.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
        groceryItemRepo.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
        groceryItemRepo.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
        groceryItemRepo.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
        groceryItemRepo.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));

        System.out.println("Data creation complete...");
    }

    // DELETE
    public void deleteGroceryItem(String id) {
        groceryItemRepo.deleteById(id);
        System.out.println("Item with id " + id + " deleted...");
    }

}

