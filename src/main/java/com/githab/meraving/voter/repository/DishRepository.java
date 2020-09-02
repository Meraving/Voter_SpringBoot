package com.githab.meraving.voter.repository;

import com.githab.meraving.voter.model.Dish;
import com.githab.meraving.voter.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DishRepository extends JpaRepository <Dish,Long> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Dish d WHERE d.id=:id")
    Long delete(@Param("id") Long id);

    List<Dish> getAllByMenu (Menu menu);
}