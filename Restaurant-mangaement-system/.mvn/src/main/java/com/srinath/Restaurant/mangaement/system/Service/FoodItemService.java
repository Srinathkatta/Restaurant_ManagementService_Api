package com.srinath.Restaurant.mangaement.system.Service;

import com.srinath.Restaurant.mangaement.system.Model.FoodItem;
import com.srinath.Restaurant.mangaement.system.Repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    IFoodRepo ifoodrepo;
    public List<FoodItem> getall() {
        return ifoodrepo.findAll();

    }
}
