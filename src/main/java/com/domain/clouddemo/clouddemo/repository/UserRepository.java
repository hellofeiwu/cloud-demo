package com.domain.clouddemo.clouddemo.repository;

import com.domain.clouddemo.clouddemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
