package com.srinath.Restaurant.mangaement.system.Repository;

import com.srinath.Restaurant.mangaement.system.Model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<OrderEntity,Long> {
}
