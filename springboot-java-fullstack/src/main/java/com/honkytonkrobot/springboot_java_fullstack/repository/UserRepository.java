package com.honkytonkrobot.springboot_java_fullstack.repository;

import com.honkytonkrobot.springboot_java_fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
