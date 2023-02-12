package com.example.projectv01.entities;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_department") // criação da tabela e atributo para dar nome a mesma
public class Department {

    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)// auto_increment
    @NotNull
    private Long id;
    private String name;

//    @OneToMany
//    private List<User> listUser;


    public Department() {
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<User> getListUser() {
//        return listUser;
//    }
//
//    public void setListUser(List<User> listUser) {
//        this.listUser = listUser;
//    }
}
