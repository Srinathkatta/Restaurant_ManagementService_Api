package com.srinath.Restaurant.mangaement.system.Repository;


import com.srinath.Restaurant.mangaement.system.Model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<FoodItem,Long> {

}
