package com.springsecurity.repositories;

import com.springsecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created 17/05/2021 - 10:23
 * @Package com.springsecurity.repositories
 * @Project springsecurity
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
