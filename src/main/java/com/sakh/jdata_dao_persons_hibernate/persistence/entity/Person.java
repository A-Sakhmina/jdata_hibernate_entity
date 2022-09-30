package com.sakh.jdata_dao_persons_hibernate.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    @EmbeddedId
    PersonInfo personInfo;
    @Column(nullable = false)
    private String phoneNumber;
    private String cityOfLiving;

}
