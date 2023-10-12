package com.srinath.Restaurant.mangaement.system.Repository;

import com.srinath.Restaurant.mangaement.system.Model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVisitorEntity extends JpaRepository<Visitor,Long> {
}
