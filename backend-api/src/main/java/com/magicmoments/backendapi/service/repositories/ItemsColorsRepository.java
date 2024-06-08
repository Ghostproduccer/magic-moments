package com.magicmoments.backendapi.service.repositories;

import com.magicmoments.backendapi.model.ItemsColors;
import com.magicmoments.backendapi.model.compositekey.ItemsColorsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsColorsRepository extends JpaRepository<ItemsColors, ItemsColorsId> {
    @Query("SELECT ic FROM ItemsColors ic WHERE ic.item.id = :itemId")
    List<ItemsColors> findByItemId(@Param("itemId") int itemId);
}
