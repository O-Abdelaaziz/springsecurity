package com.springsecurity.db;

import com.springsecurity.models.Authority;
import com.springsecurity.models.Role;
import com.springsecurity.models.User;
import com.springsecurity.repositories.AuthorityRepository;
import com.springsecurity.repositories.RoleRepository;
import com.springsecurity.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Created 18/05/2021 - 09:08
 * @Package com.springsecurity.db
 * @Project springsecurity
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@Service
public class DBInit implements CommandLineRunner {

    private UserRepository userRepository;
    private AuthorityRepository authorityRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public DBInit(UserRepository userRepository,AuthorityRepository authorityRepository,RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
        this.roleRepository=roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public DBInit(UserRepository userRepository, AuthorityRepository authorityRepository) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Long countRole=userRepository.count();
        if(countRole==0) {
            User admin = new User("ahmed", passwordEncoder.encode("ahmed123"), 20, "alex", 1);

            List<Role> roleList = this.roleRepository.findAll();
            Set<Role> roleSet = new HashSet<>(roleList);
            admin.setRoles(roleSet);

            List<Authority> authorityList = this.authorityRepository.findAll();
            Set<Authority> authoritySet = new HashSet<>(authorityList);
            admin.setAuthorities(authoritySet);

            userRepository.save(admin);

            /////////////////////////////////////////////////////////////////////////
            User manager = new User("yaser", passwordEncoder.encode("yaser123"), 20, "alex", 1);
            Role managerRole1 = roleRepository.findById(2L).get();
            Role managerRole2 = roleRepository.findById(3L).get();
            List<Role> roles = new ArrayList<>();
            roles.add(managerRole1);
            roles.add(managerRole2);
            manager.getRoles().addAll(roles);

            Authority authority1 = authorityRepository.findById(1L).get();
            manager.getAuthorities().add(authority1);

            userRepository.save(manager);
        }
    }
}
