package com.magicmoments.backendapi.service.repositories;

import com.magicmoments.backendapi.model.Colors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorsRepository extends JpaRepository<Colors, Integer> {
}
