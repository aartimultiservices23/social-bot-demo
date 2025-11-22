package com.socialbot.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialbot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // no extra methods needed right now
}

