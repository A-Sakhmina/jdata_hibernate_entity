package com.sakh.jdata_dao_persons_hibernate.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Builder
//for Entity
@NoArgsConstructor
//for builder
@AllArgsConstructor

@Entity
@Table(name = "PERSONS")
public class Person implements Serializable {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    @Column(nullable = false)
    private String phoneNumber;
    private String cityOfLiving;

}
