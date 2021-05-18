package com.springsecurity.repositories;

import com.springsecurity.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created 17/05/2021 - 10:24
 * @Package com.springsecurity.repositories
 * @Project springsecurity
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
