package com.example.springbootmybatis.model;

import javax.persistence.*;

/**
 * @Author:郭友文
 * @Data:2018/10/29 10:29
 * @Description: 部门
 */

@Entity
@Table(name = "department")
public class DepartmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

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
}
