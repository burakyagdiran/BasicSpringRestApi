package com.restapiproject.RestApp.repository;

import com.restapiproject.RestApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
