package com.example.insideout.repository;

import com.example.insideout.domain.UserServey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserServeyRepository extends JpaRepository<UserServey, Long> {
    UserServey findByUserId(Long userId);
}
