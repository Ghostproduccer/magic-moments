package com.magicmoments.backendapi.service.repositories;

import com.magicmoments.backendapi.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
