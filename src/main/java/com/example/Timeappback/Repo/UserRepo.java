package com.example.Timeappback.Repo;


import com.example.Timeappback.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
        User findByUserEmail(String userEmail);
        Optional<User> findOneByUserEmailAndUserPassword(String userEmail, String userPassword);
}
