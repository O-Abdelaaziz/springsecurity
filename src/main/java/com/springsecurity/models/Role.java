package com.springsecurity.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @Created 17/05/2021 - 09:18
 * @Package com.springsecurity.models
 * @Project springsecurity
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@Entity
@Table(name = "roles" ,schema = "public")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users=new HashSet<>();

}
